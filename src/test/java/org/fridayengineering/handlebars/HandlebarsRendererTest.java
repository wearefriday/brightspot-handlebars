package org.fridayengineering.handlebars;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fridayengineering.handlebars.HandlebarsRendererTestClass;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HandlebarsRendererTest extends Mockito {

    private HandlebarsRendererTestClass testClass = new HandlebarsRendererTestClass();
    private final String FIELD_A = "field A";
    private final String FIELD_B = "field B";

    @Before
    public void setUp() {
	testClass.setFieldA(FIELD_A);
	testClass.setFieldB(FIELD_B);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);

	when(request.getAttribute("mainContent")).thenReturn(testClass);

	HttpServletResponse response = mock(HttpServletResponse.class);
	StringWriter sWriter = new StringWriter();
	PrintWriter pWriter = new PrintWriter(sWriter);
	when(response.getWriter()).thenReturn(pWriter);

	new HandlebarsRenderer().doPost(request, response);

	verify(request, atLeast(1)).getAttribute("mainContent");
	String body = sWriter.toString();
	assertTrue(body.contains(FIELD_A));
	assertTrue(body.contains(FIELD_B));
    }
}

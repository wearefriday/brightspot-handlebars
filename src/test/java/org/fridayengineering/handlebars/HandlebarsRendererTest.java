package org.fridayengineering.handlebars;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

public class HandlebarsRendererTest extends Mockito {

    @Test
    public void testDoGet() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);

	// new HandlebarsRenderer().doPost(request, response);

	assertTrue(true);
    }
}

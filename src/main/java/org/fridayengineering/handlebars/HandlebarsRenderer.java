package org.fridayengineering.handlebars;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.psddev.cms.db.Renderer;

@SuppressWarnings("serial")
public class HandlebarsRenderer extends HttpServlet 
{

    private static final Logger logger = LoggerFactory.getLogger(HandlebarsRenderer.class);

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

	Object mainContent = request.getAttribute("mainContent");

	TemplateLoader loader = new ServletContextTemplateLoader(getServletContext(), "/WEB-INF/templates/hbs/", null);
	Handlebars handlebars = new Handlebars(loader);
	Template template = handlebars.compile(getRendererPath(request, mainContent));

	String output = template.apply(mainContent);
	Writer writer = null;
	writer = response.getWriter();
	writer.write(output);
	IOUtils.closeQuietly(writer);
    }

    private String getRendererPath(HttpServletRequest request, Object mainContent) {
	Class<? extends Object> clazz = mainContent.getClass();
	return clazz.getAnnotation(Renderer.Path.class).value();
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
    }

}
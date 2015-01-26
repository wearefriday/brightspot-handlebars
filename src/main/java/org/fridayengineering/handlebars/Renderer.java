package org.fridayengineering.handlebars;

import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import java.io.*;

public class Renderer extends HttpServlet 
{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {

        String message;

        message = "";

        Handlebars handlebars = new Handlebars();
        try {
          Template template = handlebars.compileInline("Hello {{this}}!");

          message = template.apply("Brightspot");} catch(IOException e) {
            e.printStackTrace();
        }
        res.setContentType("text/html"); PrintWriter out = res.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println(message); 
        out.println("</BODY></HTML>");
    }
}
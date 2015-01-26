package org.fridayengineering.handlebars;

import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import java.io.*;

import java.util.Enumeration;

public class Renderer extends HttpServlet 
{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {

        String message;

        message = "";

        String mainContent = "mainContent";
        Object content = req.getAttribute(mainContent);

        Handlebars handlebars = new Handlebars();
        try {
          Template template = handlebars.compileInline("Got:{{this}}");

          message = template.apply(content);} catch(IOException e) {
            e.printStackTrace();
        }
        res.setContentType("text/html"); PrintWriter out = res.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println(message); 


        out.println("</BODY></HTML>");
    }
}
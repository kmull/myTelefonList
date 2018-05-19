package com.pl.myWebProject.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        writer.println("<!DOCTYPE html><html><body>");
        writer.println("Krzysztof Muller<BR/>" +
        "aaaaaaaaaaa<BR/>bbbbbbbbbbb<BR/>");
        writer.println("cccccccccccc");
        writer.println("</body></html>");
    }

}

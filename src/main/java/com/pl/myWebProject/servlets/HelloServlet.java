package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("hello-servlet")
public class HelloServlet extends HttpServlet {

    @Inject
    UserRepositoryDao dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");



//        writer.println("<!DOCTYPE html><html><body>");
//
//        try {
//            for (User user : dao.getUserList()) {
//                writer.println(user.getId() + ") Imie: " + user.getName() +
//                        "<BR/>Nazwisko: " + user.getSurname() +
//                        "<BR/> telefon: " + user.getMobile() + "<BR/><BR/>");
//            }
//        } catch (Exception e) {
//            writer.println("error");
//        }
//
//
//        writer.println("</body></html>");
    }

}

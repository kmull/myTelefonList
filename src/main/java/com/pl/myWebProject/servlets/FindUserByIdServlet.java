package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {

    @Inject
    UserRepositoryDao dao;

    int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<!DOCTYPE html><html><body>" +
//                "<CENTER><H1>Strona głowna</H1></CENTER><BR/><BR/>");
//
//        String requestId = req.getParameter("id");
//
//        try {
//            if (requestId == null) {
//                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//                return;
//            } else {
//                id = Integer.valueOf(requestId);
//            }
//        } catch (NullPointerException e) {
//            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//        }
//
//        User user = dao.getUserById(id);
//
//        if (user != null) {
//            writer.println("imie: " + user.getName() +
//                    "<BR/>nazwisko: " + user.getSurname() +
//                    "<BR/>wiek: " + user.getAge() +
//                    "<BR/>plec: " + user.getGender() +
//                    "<BR/>telefon stacjonarny: " + user.getTelephone() +
//                    "<BR/>komorka: " + user.getMobile() +
//                    "<BR/>adres: " + user.getAddress());
//
//        } else {
//            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//            writer.println("Nie znaleziono usera");
//        }
//        writer.println("</body></html>");
    }
}

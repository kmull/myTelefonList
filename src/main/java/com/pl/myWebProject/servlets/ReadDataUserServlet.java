package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;
import com.pl.myWebProject.domain.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("read-user")
public class ReadDataUserServlet extends HttpServlet {

    @Inject
    UserRepositoryDao userRepositoryDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        List<User> userList = userRepositoryDao.getUserList();
        int counter = 0;


        if (!userList.isEmpty()) {
            writer.println("<!DOCTYPE html><html><body>");
            for (User user : userList) {
                writer.println((++counter) + " imie: " + user.getName() + " " + user.getSurname() + "<BR/>" +
                        "wiek: " + user.getAge() + " płeć: " + user.getGender() + "<BR/>" +
                        "tel. stacjonarny: " + user.getTelephone() + "<BR/>" +
                        "tel. komórkowy: " + user.getMobile() + "<BR/>" +
                        "adres: " + user.getAddress() + "<BR/><BR/>");
            }
        }
    }

}

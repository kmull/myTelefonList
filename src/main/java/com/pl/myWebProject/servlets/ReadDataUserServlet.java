package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;
import com.pl.myWebProject.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/read-user")
public class ReadDataUserServlet extends HttpServlet {

    @Inject
    UserRepositoryDao userRepositoryDao;
    private Logger log = LoggerFactory.getLogger(ReadDataUserServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        log.info("doPost started");
        doRecive(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        log.info("doGet started");
        doRecive(req, resp);
    }

    protected void doRecive(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        List<User> userList = userRepositoryDao.getUserList();
        int counter = 0;
        String errorMessage;
        log.info("ReadDataUserServlet started!");

        if(!userList.isEmpty()){
//            req.setAttribute("userList", userList);
            req.getSession().setAttribute("userList", userList);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("readUsers.jsp");
            requestDispatcher.forward(req, resp);
            log.info("Wyszukano liste userList!");
        } else {
            req.setAttribute("errorMessage", HttpServletResponse.SC_NOT_FOUND);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("readUsers.jsp");
            requestDispatcher.forward(req, resp);
            log.error("Nie znaleziono listy userlist");
        }

//        if (!userList.isEmpty()) {
//            writer.println("<!DOCTYPE html><html><body>");
//            for (User user : userList) {
//                writer.println((++counter) + " imie: " + user.getName() + " " + user.getSurname() + "<BR/>" +
//                        "wiek: " + user.getAge() + " płeć: " + user.getGender() + "<BR/>" +
//                        "tel. stacjonarny: " + user.getTelephone() + "<BR/>" +
//                        "tel. komórkowy: " + user.getMobile() + "<BR/>" +
//                        "adres: " + user.getAddress() + "<BR/><BR/>");
//            }
//        }
    }

}

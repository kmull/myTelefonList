package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;
import com.pl.myWebProject.domain.Gender;
import com.pl.myWebProject.domain.User;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-user")
public class AddUserServlet extends HttpServlet {

    @Inject
    UserRepositoryDao dao;
    private String errorMessage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRecive(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRecive(req, resp);
    }

    private void doRecive(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        User user = new User();

        if (req.getParameter("name") == null || req.getParameter("name").isEmpty() ||
                req.getParameter("surname") == null || req.getParameter("surname").isEmpty() ||
                req.getParameter("age") == null || req.getParameter("age").isEmpty() ||
                req.getParameter("telephone") == null || req.getParameter("telephone").isEmpty() ||
                req.getParameter("mobile") == null || req.getParameter("mobile").isEmpty() ||
                req.getParameter("address") == null || req.getParameter("address").isEmpty()) {

            System.out.println(HttpServletResponse.SC_BAD_REQUEST);
            errorMessage = "Bad request";
            req.setAttribute("errorMessage", errorMessage);
//            RequestDispatcher requestDispatcher = req.getRequestDispatcher("addUser.jsp");
//            requestDispatcher.forward(req, resp);
////            return;
//            doRecive(req, resp);
        }
        try {

            user.setName(req.getParameter("name"));
            user.setSurname(req.getParameter("surname"));
            user.setAge(Integer.parseInt(req.getParameter("age")));
            user.setTelephone(Integer.parseInt(req.getParameter("telephone")));
            user.setMobile(Integer.parseInt(req.getParameter("mobile")));
            user.setAddress(req.getParameter("address"));
            setUserGender(req, user);
            dao.addUser(user);

            writer.println(user.getId() + "\n" +
                    user.getName() + "\n" +
                    user.getSurname());

            writer.println("dodano");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



//        req.setAttribute("okMessage", "User " + user.getName() + " has been added");
//
//        writer.println(user.getName());
//
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("addUser.jsp");
        requestDispatcher.forward(req, resp);
    }

    protected void setUserGender(HttpServletRequest req, User user) {
        String gender = req.getParameter("gender");
        if ("MAN".equals(gender.toUpperCase())) {
            user.setGender(Gender.MAN);
        } else if ("WOMAN".equals(gender.toUpperCase())) {
            user.setGender(Gender.WOMAN);
        } else {
            user.setGender(null);
        }
    }

}

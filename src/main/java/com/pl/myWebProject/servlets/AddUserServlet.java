package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoUser.UserRepositoryDao;
import com.pl.myWebProject.domain.Gender;
import com.pl.myWebProject.domain.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

@WebServlet("/add-user")
public class AddUserServlet extends HttpServlet {

    @Inject
    UserRepositoryDao dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addUser(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addUser(req, resp);
    }

    private void addUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        User user = new User();
//        user.setId(Integer.parseInt(req.getParameter("id")));
        user.setName(req.getParameter("name"));
        user.setSurname(req.getParameter("surname"));
        user.setAge(Integer.parseInt(req.getParameter("age")));
        user.setTelephone(req.getParameter("telephone"));
        user.setMobile(req.getParameter("mobile"));
        user.setAddress(req.getParameter("address"));
        setUserGender(req, user);

        writer.println(user.getId() + "\n" +
                user.getName() + "<BR/>" +
                user.getSurname());

        dao.addUser(user);
        writer.println("dodano");

        req.setAttribute("okMessage", "User " + user.getName() + " has been added");

        writer.println(user.getName());
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
//        requestDispatcher.forward(req, resp);
    }

    protected void setUserGender(HttpServletRequest req, User user) {
        String gender = req.getParameter("gender");
        if ("MAN".equals(gender)) {
            user.setGender(Gender.MAN);
        } else if ("WOMAN".equals(gender)) {
            user.setGender(Gender.WOMAN);
        } else {
            user.setGender(null);
        }
    }

}

package com.pl.myWebProject.servlets;

import com.pl.myWebProject.DaoCar.CarRepositoryDao;
import com.pl.myWebProject.domain.Car;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("add-car")
public class AddCarServlet extends HttpServlet {

    @EJB
    CarRepositoryDao carRepositoryDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addCar(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        addCar(req, resp);
    }

    private void addCar(HttpServletRequest req, HttpServletResponse resp){

        Car car = new Car();
//        car.setId(1);
        car.setModel("Golf");

        carRepositoryDao.addCar(car);

    }
}

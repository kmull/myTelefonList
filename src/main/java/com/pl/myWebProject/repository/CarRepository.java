package com.pl.myWebProject.repository;


import com.pl.myWebProject.domain.Car;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CarRepository {

    @PersistenceContext(unitName = "pUnit")
    protected EntityManager entityManager;

    public void addCar(Car car){
        entityManager.persist(car);
        System.out.println("samochod dodany");
    }
}

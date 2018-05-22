package com.pl.myWebProject.DaoCar;

import com.pl.myWebProject.domain.Car;

import javax.ejb.Local;

@Local
public interface CarRepositoryDao {

    public void addCar(Car car);
}

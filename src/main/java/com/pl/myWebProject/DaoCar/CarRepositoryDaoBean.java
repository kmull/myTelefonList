package com.pl.myWebProject.DaoCar;

import com.pl.myWebProject.domain.Car;
import com.pl.myWebProject.repository.CarRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CarRepositoryDaoBean implements CarRepositoryDao {

    @EJB
    protected CarRepository carRepository;

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }
}

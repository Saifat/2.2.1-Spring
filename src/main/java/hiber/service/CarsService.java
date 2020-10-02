package hiber.service;

import hiber.model.Car;


import java.util.List;

public interface CarsService {
    void add(Car car);
    List<Car> listCars();

}

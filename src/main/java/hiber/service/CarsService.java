package hiber.service;

import hiber.model.Car;
import hiber.model.User;


import java.util.List;

public interface CarsService {
    void add(Car car);
    List<Car> listCars();
    public User getUser(String model, int series);

}

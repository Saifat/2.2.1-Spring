package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarsDao {

    void add(Car car);
    List<Car> listCars();
}

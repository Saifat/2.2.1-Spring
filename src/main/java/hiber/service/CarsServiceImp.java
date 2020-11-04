package hiber.service;

import hiber.dao.CarsDao;
import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CarsServiceImp implements CarsService {

    @Autowired
    private CarsDao carsDao;

    @Transactional
    @Override
    public void add(Car car) {
        carsDao.add(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCars() {
        return null;
    }

    @Transactional
    @Override
    public User getUser(String model, int series) {
        return carsDao.getUser(model, series);
    }
}

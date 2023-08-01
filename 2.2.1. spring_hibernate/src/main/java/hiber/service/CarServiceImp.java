package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarServiceImp implements CarService{
    private UserDao userDao;


    @Transactional
    @Override
    public void add(Car car) {
        this.userDao = (UserDao) car;
    }
}

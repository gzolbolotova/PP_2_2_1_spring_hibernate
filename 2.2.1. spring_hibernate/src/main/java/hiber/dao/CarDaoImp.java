package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;

public class CarDaoImp implements CarDao{
    private final SessionFactory sessionFactory;

    public CarDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);

    }
}

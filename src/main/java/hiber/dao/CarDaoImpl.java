package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    public Car getCarByModelAndSeries(String model, int series) {
        return (Car) sessionFactory.getCurrentSession()
                .createQuery("FROM Car WHERE model = :model AND series = :series")
                .setParameter("model", model)
                .setParameter("series", series)
                .uniqueResult();
    }
}

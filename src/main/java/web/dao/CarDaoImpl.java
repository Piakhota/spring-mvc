package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "Enzo", 2003));
        cars.add(new Car("McLaren", "P1", 2014));
        cars.add(new Car("Lotus", "Elise", 1997));
        cars.add(new Car("Bugatti", "Veyron", 2010));
        cars.add(new Car("Lamborghini", "Aventador", 2015));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(Integer count) {
        return cars.subList(0, count);
    }
}

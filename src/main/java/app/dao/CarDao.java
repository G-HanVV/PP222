package app.dao;

import app.model.Car;

import java.util.List;


public interface CarDao {

    void add(Car car);

    List<Car> getCarList(int count);
}

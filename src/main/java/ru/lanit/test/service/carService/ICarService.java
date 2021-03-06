package ru.lanit.test.service.carService;

import ru.lanit.test.model.Car;
import ru.lanit.test.service.IService;

import java.util.List;

public interface ICarService extends IService<Car> {
    Long findCarId(long id);

    List<Car> findAllByOwnerId(long id);

    Long countCar();

    Long countCarVendor();

    void deleteAll();
}

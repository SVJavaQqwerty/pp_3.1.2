package ru.svlid.servingwebcontent.service;

import ru.svlid.servingwebcontent.models.Car;
import java.util.List;

public interface CarService {
    public List<Car> showCountCar(Long count);
}
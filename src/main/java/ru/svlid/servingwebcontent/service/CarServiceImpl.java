package ru.svlid.servingwebcontent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.svlid.servingwebcontent.models.Car;
import ru.svlid.servingwebcontent.repository.CarRepo;

import java.util.List;



@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepo carRepo;
    @Override
    public List<Car> showCountCar(Long count) {
        List<Car> cars = (List<Car>) carRepo.findAll();
        if(count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
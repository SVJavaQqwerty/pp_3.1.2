package ru.svlid.servingwebcontent.repository;

import org.springframework.data.repository.CrudRepository;
import ru.svlid.servingwebcontent.models.Car;

public interface CarRepo extends CrudRepository<Car, Long> {
}

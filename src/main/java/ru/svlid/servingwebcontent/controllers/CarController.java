package ru.svlid.servingwebcontent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import ru.svlid.servingwebcontent.models.Car;
import ru.svlid.servingwebcontent.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/car")
    public String car(Model model, @RequestParam(value = "count", required = false, defaultValue = "5") Long count) {
        model.addAttribute("cars", carService.showCountCar(count));
        return "car";
    }
}

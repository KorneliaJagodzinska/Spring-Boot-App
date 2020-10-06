package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {
    @Autowired
    private CarManager carManager;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/getCars")
    public List<Car> getCars() {
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car car) {
        return carManager.addCar(car);
    }
}

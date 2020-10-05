package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Data
@Service
public class CarManager {
    private List<Car> carList;

    private CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Polo", "VW"));
        carList.add(new Car("126p", "Fiat"));
    }
    public List<Car> addCar(Car car){
         carList.add(car);
         return this.carList;
    }
}

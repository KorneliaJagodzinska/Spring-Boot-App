package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class CarManager {
    private List<Car> carList;


}

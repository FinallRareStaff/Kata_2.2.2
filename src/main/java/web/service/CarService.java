package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW",8,3500000));
        cars.add(new Car("Mersedes",200,7000000));
        cars.add(new Car("Skoda Octavia",7,2000000));
        cars.add(new Car("Tesla",2,4500000));
        cars.add(new Car("Cadillac",5,9000000));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCars(int value) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            result.add(cars.get(i));
        }
        return result;
    }

}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else if (count <= carService.getCars().size()) {
            model.addAttribute("cars", carService.getCars(count));
        } else if (count > carService.getCars().size()){
            model.addAttribute("cars", carService.getCars());
        }
        return "car";
    }
}

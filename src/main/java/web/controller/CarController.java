package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.ICarService;


import java.util.List;

@Controller
public class CarController {

    @Autowired
    private ICarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars"; // Имя шаблона
    }
}

package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import app.model.Car;
import app.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

//    {
//        CarService carService = WebConfig.getApplicationContextS().getBean(CarService.class);
//        carService.add(new Car("Car1", 222, "blue"));
//        carService.add(new Car("Car2", 234, "red"));
//        carService.add(new Car("Car3", 366, "green"));
//        carService.add(new Car("Car4", 113, "purple"));
//        carService.add(new Car("Car5", 855, "black"));
//    }


    @GetMapping(value = "/start")
    public String startCar(@RequestParam("count") int count, ModelMap model){

        List<Car> cars = carService.getCarList(count);

        model.addAttribute("cars", cars);

        return "/car/start";
    }

}

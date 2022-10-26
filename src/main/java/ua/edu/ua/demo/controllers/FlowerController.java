package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ua.demo.flowers.CactusFlower;
import ua.edu.ua.demo.flowers.Flower;
import ua.edu.ua.demo.flowers.FlowerColor;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> flowers() {
        return List.of(
                new CactusFlower(FlowerColor.GREEN, 50, 100)
        );
    }
}

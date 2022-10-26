package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ua.demo.flowers.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/flower-bucket")
public class FlowerBucketController {
    @GetMapping
    public List<FlowerBucket> flowersInBucket() {
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(new CactusFlower(FlowerColor.GREEN, 50, 29));
        bucket.addFlowers(new RomashkaFlower(FlowerColor.WHITE, 40, 17));
        return List.of(bucket);
    }
}

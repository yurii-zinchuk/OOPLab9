package ua.edu.ua.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ua.demo.flowers.Flower;
import ua.edu.ua.demo.flowers.FlowerRepository;

import java.util.List;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}

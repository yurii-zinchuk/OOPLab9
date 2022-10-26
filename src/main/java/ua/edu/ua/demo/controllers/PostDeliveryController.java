package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/delivery-post")
public class PostDeliveryController {
    @GetMapping
    public String whichDelivery() {
        return "Post delivery service is used.";
    }
}

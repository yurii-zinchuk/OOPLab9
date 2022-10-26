package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/delivery-dhl")
public class DHLDeliveryController{
    @GetMapping
    public String whichDelivery() {
        return "DHL delivery service is used.";
    }
}

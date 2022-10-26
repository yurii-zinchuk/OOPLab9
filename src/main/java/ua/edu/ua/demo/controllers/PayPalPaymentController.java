package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payment-pp")
public class PayPalPaymentController {
    @GetMapping
    public String whichPayment() {
        return "PayPal payment is used.";
    }
}

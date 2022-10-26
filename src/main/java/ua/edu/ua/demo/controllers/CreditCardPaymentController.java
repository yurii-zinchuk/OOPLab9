package ua.edu.ua.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payment-cc")
public class CreditCardPaymentController {
    @GetMapping
    public String whichPayment() {
        return "Credit card payment is used.";
    }
}

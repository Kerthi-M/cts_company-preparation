package com.microservices.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/details")
    public String getDetails() {
        String accountServiceUrl = "http://localhost:8081/account";
        String loanServiceUrl = "http://localhost:8082/loan";

        String accountDetails = restTemplate.getForObject(accountServiceUrl, String.class);
        String loanDetails = restTemplate.getForObject(loanServiceUrl, String.class);

        return "Account: " + accountDetails + "\nLoan: " + loanDetails;
    }
}

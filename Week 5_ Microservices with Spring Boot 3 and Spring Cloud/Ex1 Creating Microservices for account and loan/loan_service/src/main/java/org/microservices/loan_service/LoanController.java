package org.microservices.loan_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public String getLoanDetails() {
        return "Loan Service: Loan details for your account";
    }
}

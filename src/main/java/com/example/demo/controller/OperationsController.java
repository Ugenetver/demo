package com.example.demo.controller;


import com.example.demo.data.BankAccount;
import com.example.demo.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    public final AccountService accountService;

    public OperationsController() {
        accountService = new AccountService();
    }

    @GetMapping("/payment")
    public BankAccount payment(@RequestParam("method") String method, @RequestParam("amount") Double amount) throws Exception {
        return accountService.payment(method, amount);
    }

    @GetMapping("/bankAccountOfEMoney")
    public Double bankAccountOfEMoney() {
        return accountService.bankAccountOfEMoney();
    }

    @GetMapping("/money")
    public Double money() {
        return accountService.money();
    }

}

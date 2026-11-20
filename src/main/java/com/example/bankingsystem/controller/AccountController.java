package com.example.bankingsystem.controller;

import com.example.bankingsystem.service.AccountService;
import com.example.bankingsystem.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }
    @GetMapping
    public List<Account> getAll(){
        return accountService.getAll();
    }
}
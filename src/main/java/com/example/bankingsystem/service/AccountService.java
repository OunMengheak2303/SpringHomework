package com.example.bankingsystem.service;

import com.example.bankingsystem.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private final List<Account> accounts = new ArrayList<>();

    public Account saveAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public List<Account> getAll() {
        return accounts;
    }
}
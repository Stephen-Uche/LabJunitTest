package com.example.banks;

import com.example.banks.BankService;

public class BankServiceImpl implements BankService {
    boolean isPaid = false;
    @Override
    public void pay(String id, double amount) {
        isPaid = true;
    }
}

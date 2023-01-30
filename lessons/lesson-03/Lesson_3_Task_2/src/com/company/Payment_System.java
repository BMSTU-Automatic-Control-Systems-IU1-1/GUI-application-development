package com.company;

public class Payment_System{
    public int transaction(Wallet client_1, Wallet client_2, double currentSum) {
        int first_operation = client_1.transaction(currentSum, 0);
        client_2.transaction(-currentSum, first_operation);
    }
}

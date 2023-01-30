package com.company;

public class Wallet {
    private double currentMoney = 0;
    private String numberOfCard = "";

    public Wallet(double currentMoney, String numberOfCard) {
        this.numberOfCard = numberOfCard;
        this.currentMoney = currentMoney;
    }

    public int transaction(double currentSum, int isTransactionCorrect) {
        if (isTransactionCorrect < 0) { return -1; }

        if (currentSum > 0) {
            if (currentMoney > currentSum) {
                currentMoney -= currentSum;
            } else { return -2; }
        } else {
            if (currentMoney < -currentSum) {
                currentMoney += currentSum;
            } else { return -2; }
        }

        return 0;
    }

}

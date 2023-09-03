package org.campus02.oop;

public abstract class Payment {
    private double amount;
    private String currency;

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double exchangeToEUR() {
        switch (currency) {
            case "EUR":
                return amount;
            case "USD":
                return amount / 1.1;
            case "GPB":
                return amount / 0.85;
            case "SEK":
                return amount / 9.5;
            case "HUF":
                return amount / 310.0;
            default:
                return amount / 2.0;
        }
    }

    public abstract double calcTransactionCosts();
}

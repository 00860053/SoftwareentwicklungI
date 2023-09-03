package org.campus02.oop.payment;

public class MaestroPayment extends Payment {

    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        if ((exchangeToEUR() * 0.0075) < 0.95) {
            return 0.95;
        } else
        return (exchangeToEUR() * 0.0075);
    }

    @Override
    public String toString() {
        return "[MaestroPayment" +
                "CardNumber='" + cardNumber + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                ']';
    }
}

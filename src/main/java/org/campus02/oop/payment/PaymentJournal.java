package org.campus02.oop.payment;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList <Payment> payments = new ArrayList<>();

    public void add(Payment payment) {
        payments.add(payment);
    }

    public double calcTotalTransactionCosts() {
        double totalTransactionCosts = 0;
        for (Payment payment : payments) {
            totalTransactionCosts += payment.calcTransactionCosts();
        }
        return totalTransactionCosts;
    }

    public HashMap<String, Integer> getPaymentsPerCurrency() {
        HashMap<String, Integer> resultPaymentsPerCurrency = new HashMap<>();

        for (Payment payment : payments) {
            if (resultPaymentsPerCurrency.containsKey(payment.getCurrency())){
                Integer count = resultPaymentsPerCurrency.get(payment.getCurrency());
                count++;
                resultPaymentsPerCurrency.put(payment.getCurrency(), count);
            } else {
              resultPaymentsPerCurrency.put(payment.getCurrency(), 1);
            }
        }
        return resultPaymentsPerCurrency;
    }
}

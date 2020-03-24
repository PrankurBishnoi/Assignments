package com.prankur.JPA2.inheritance.tablePerClass;

import javax.persistence.Entity;

@Entity
public class CreditCardTablePerClass extends PaymentTablePerClass {
    private String creditCard;

    public CreditCardTablePerClass( double amount, String creditCard) {
        super( amount);
        this.creditCard = creditCard;
    }

    public CreditCardTablePerClass(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCard() {

        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "CreditCardTablePerClass{" +
                "creditCard='" + creditCard + '\'' +
                '}';
    }
}

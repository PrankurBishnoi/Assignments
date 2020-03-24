package com.prankur.JPA2.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CreditCardJoined extends PaymentJoined
{
    private String creditCard;

    public CreditCardJoined( double amount, String creditCard) {
        super( amount);
        this.creditCard = creditCard;
    }

    public CreditCardJoined(String creditCard) {
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
        return "CreditCardJoined{" +
                "creditCard='" + creditCard + '\'' +
                '}';
    }
}

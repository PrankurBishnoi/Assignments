package com.prankur.JPA2.inheritance.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class CreditCardSingleTable extends PaymentSingleTable
{
    private String creditCard;

    public CreditCardSingleTable(double amount, String creditCard) {
        super( amount);
        this.creditCard = creditCard;
    }

    public CreditCardSingleTable(String creditCard) {
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
        return "CreditCardSingleTable{" +
                "creditCard='" + creditCard + '\'' +
                '}';
    }
}

package com.prankur.JPA2.inheritance.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class ChequeSingleTable extends PaymentSingleTable
{
    private String cheque;

    public ChequeSingleTable(double amount, String cheque) {
        super(amount);
        this.cheque = cheque;
    }

    public ChequeSingleTable(String cheque) {
        this.cheque = cheque;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    @Override
    public String toString() {
        return "ChequeSingleTable{" +
                "cheque='" + cheque + '\'' +
                '}';
    }



}


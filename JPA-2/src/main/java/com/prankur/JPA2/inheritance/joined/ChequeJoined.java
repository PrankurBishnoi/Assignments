package com.prankur.JPA2.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ChequeJoined extends PaymentJoined
{
    private String cheque;

    public ChequeJoined( double amount, String cheque) {
        super( amount);
        this.cheque = cheque;
    }

    public ChequeJoined(String cheque) {
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
        return "ChequeJoined{" +
                "cheque='" + cheque + '\'' +
                '}';
    }
}

package com.prankur.JPA2.inheritance.tablePerClass;

import javax.persistence.Entity;

@Entity
public class ChequeTablePerClass extends PaymentTablePerClass
{
    private String cheque;

    public ChequeTablePerClass( double amount, String cheque) {
        super(amount);
        this.cheque = cheque;
    }

    public ChequeTablePerClass(String cheque) {
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
        return "ChequeTablePerClass{" +
                "cheque='" + cheque + '\'' +
                '}';
    }
}

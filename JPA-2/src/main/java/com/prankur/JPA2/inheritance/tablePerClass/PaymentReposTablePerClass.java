package com.prankur.JPA2.inheritance.tablePerClass;

import org.springframework.data.repository.CrudRepository;

public interface PaymentReposTablePerClass extends CrudRepository<PaymentTablePerClass,Integer> {
}

package com.prankur.JPA2.inheritance.joined;

import org.springframework.data.repository.CrudRepository;

public interface PaymentReposJoined extends CrudRepository<PaymentJoined,Integer> {
}

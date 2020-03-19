package com.prankur.JPA1;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Ans 2- Set up EmployeeRepository with Spring Data JPA
//@Repository
public interface EmployeeRepos extends CrudRepository<Employee, Integer>
{
    //For Ans 8
    Iterable<Employee> findAll(Pageable pageable);

    //For Ans 9
    List<Employee> findByName(String name);

    //For Ans 10
    List<Employee> findByNameLike(String pattern);

    //For Ans 11
    List<Employee> findByAgeBetween(int i, int i1);
}

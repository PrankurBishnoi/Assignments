package com.prankur.RestfulServices.Employees;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee
{
    private Integer id;

    @NotNull
    @Size(min = 5, message = "Name should be Greater than 5 alphabets")
    private String name;

    @Min(value = 16)
    @Max(value = 59)
    private Integer Age;

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}

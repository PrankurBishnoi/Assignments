package com.prankur.RestfulServices.Employees;
import com.prankur.RestfulServices.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeResource
{
    @Autowired
    private EmployeeDaoService service;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee()
    {
        return service.findAll();
    }

    @GetMapping("employee/{id}")
    public EntityModel<Employee> retrieveEmployee(@PathVariable int id)
    {
        Employee employee = service.findOne(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id - "+id);
        EntityModel<Employee> entityModel = new EntityModel<Employee>(employee);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllEmployee());
        entityModel.add(linkTo.withRel("All-Employees"));
        return entityModel;
    }

    @DeleteMapping("employee/{id}")
    public Employee deleteOneEmployee(@PathVariable int id)
    {
        Employee employee = service.deleteone(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id - "+id);
        return employee;
    }

    @Validated
    @PostMapping("/employees")
    public ResponseEntity createUser(@Valid @RequestBody Employee employee)
    {
        Employee savedEmployee = service.save(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    //PUT
    @PutMapping("/updateEmployee")
    public Employee updateOneEmployee(@RequestBody Employee employee)
    {
        employee = service.updateOne(employee);
        return employee;
    }

}

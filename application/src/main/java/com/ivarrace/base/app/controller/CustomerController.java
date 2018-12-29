package com.ivarrace.base.app.controller;

import com.ivarrace.base.core.service.CustomerService;
import com.ivarrace.base.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/findByFirstName")
    public List<Customer> findByFirstName(@RequestParam(value="firstName") String firstName) {
        return customerService.findByFirstName(firstName);
    }

    @GetMapping("/findByLastName")
    public List<Customer> findByLastName(@RequestParam(value="lastName") String lastName) {
        return customerService.findByLastName(lastName);
    }

    @GetMapping("/findAll")
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}

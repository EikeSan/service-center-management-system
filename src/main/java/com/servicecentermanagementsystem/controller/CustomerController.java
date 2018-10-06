package com.servicecentermanagementsystem.controller;

import com.servicecentermanagementsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
}

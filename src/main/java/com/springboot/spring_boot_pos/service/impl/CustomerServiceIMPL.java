package com.springboot.spring_boot_pos.service.impl;

import com.springboot.spring_boot_pos.dto.CustomerDTO;
import com.springboot.spring_boot_pos.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO.getCustomerAddress());
        return customerDTO.getCustomerName();
    }
}

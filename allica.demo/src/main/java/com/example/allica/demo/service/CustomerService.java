package com.example.allica.demo.service;

import com.example.allica.demo.pojo.CustomerDetail;
import com.example.allica.demo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;


    public Optional<CustomerDetail> getCustomerDetail(Integer customerId) {
        return customerRepo.findById(customerId);
    }

    public void updateCustomerDetail(CustomerDetail customer) {
        customerRepo.save(customer);
    }

    public List<CustomerDetail> getAllCustomerDetail() {
        return customerRepo.findAll();
    }
}

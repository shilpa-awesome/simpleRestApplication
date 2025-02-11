package com.example.allica.demo.controller;

import com.example.allica.demo.pojo.CustomerDetail;
import com.example.allica.demo.service.CustomerService;
import com.example.allica.demo.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService service;
    @GetMapping("/{customerId}")
    public CustomerDetail getCustomerDetail(@PathVariable Integer customerId){
        Optional<CustomerDetail> customerDetail =  service.getCustomerDetail(customerId);
        if(!customerDetail.isPresent()){
                throw new CustomerNotFoundException("Customer Not Found");
        }
        return customerDetail.get();
    }
    @GetMapping()
    public List<CustomerDetail> getAllCustomerDetail(){
        List<CustomerDetail> customerDetailList =  service.getAllCustomerDetail();

        return customerDetailList;
    }
    @PostMapping
    public void updateCustomerDetail(@RequestBody CustomerDetail customer){
        service.updateCustomerDetail(customer);
    }
}

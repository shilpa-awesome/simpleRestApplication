package com.example.allica.demo.repository;

import com.example.allica.demo.pojo.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerDetail,Integer> {

}

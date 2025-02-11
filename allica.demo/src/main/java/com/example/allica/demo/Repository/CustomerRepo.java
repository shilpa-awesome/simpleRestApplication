package com.example.allica.demo.Repository;

import com.example.allica.demo.Pojo.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerDetail,Integer> {

}

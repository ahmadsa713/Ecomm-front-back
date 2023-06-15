package com.eproject.springbootsite.dao;


import com.eproject.springbootsite.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

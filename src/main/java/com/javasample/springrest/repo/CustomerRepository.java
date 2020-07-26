package com.javasample.springrest.repo;

import com.javasample.springrest.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByAge(int age);
}

package com.khofylabs.crudwithvaadin.repositories;

import com.khofylabs.crudwithvaadin.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByLastNameStartsWithIgnoreCase(String lastName);
}

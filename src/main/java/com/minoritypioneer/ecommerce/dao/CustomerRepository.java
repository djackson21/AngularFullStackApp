package com.minoritypioneer.ecommerce.dao;

import com.minoritypioneer.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

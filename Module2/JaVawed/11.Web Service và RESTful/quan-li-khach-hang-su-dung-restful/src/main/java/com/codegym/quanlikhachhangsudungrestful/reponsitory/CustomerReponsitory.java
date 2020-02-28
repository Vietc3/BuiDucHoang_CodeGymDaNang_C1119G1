package com.codegym.quanlikhachhangsudungrestful.reponsitory;

import com.codegym.quanlikhachhangsudungrestful.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerReponsitory extends JpaRepository<Customer ,Long> {
    @Query("select c from Customer c where c.id=?1")
    Customer findByIdZ(Long id);
}

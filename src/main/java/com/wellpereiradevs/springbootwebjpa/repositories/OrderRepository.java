package com.wellpereiradevs.springbootwebjpa.repositories;

import com.wellpereiradevs.springbootwebjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

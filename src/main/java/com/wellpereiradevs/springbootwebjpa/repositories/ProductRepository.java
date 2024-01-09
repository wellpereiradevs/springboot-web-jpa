package com.wellpereiradevs.springbootwebjpa.repositories;

import com.wellpereiradevs.springbootwebjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

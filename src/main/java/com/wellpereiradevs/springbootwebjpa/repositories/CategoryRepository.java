package com.wellpereiradevs.springbootwebjpa.repositories;

import com.wellpereiradevs.springbootwebjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.wellpereiradevs.springbootwebjpa.repositories;

import com.wellpereiradevs.springbootwebjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.example.marketkurly.repository;

import com.example.marketkurly.model.Cart;
import com.example.marketkurly.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findAllBy();
    Optional<Cart> findAllByUser(User user);

    //     findByProductIds();
}
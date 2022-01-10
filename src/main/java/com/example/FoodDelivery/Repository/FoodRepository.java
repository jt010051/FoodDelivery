package com.example.FoodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FoodDelivery.domain.Food;


@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
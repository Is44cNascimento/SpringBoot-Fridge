package dev.java10x.fridge.repository;

import dev.java10x.fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {




}

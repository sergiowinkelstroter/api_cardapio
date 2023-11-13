package com.sergiowinkelstroter.cardapio.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiowinkelstroter.cardapio.entities.FoodEntity;

public interface FoodRepository extends JpaRepository<FoodEntity, Long>{
    
}

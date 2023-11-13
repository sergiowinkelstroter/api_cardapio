package com.sergiowinkelstroter.cardapio.DTO;

import com.sergiowinkelstroter.cardapio.entities.FoodEntity;

public record FoodDTO(Long id, String name, String price, String image) {
    public FoodDTO(FoodEntity food){
        this(food.getId(), food.getName(), food.getPrice(), food.getImage());
    }
    
}

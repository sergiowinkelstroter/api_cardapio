package com.sergiowinkelstroter.cardapio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiowinkelstroter.cardapio.DTO.CreateFoodDTO;
import com.sergiowinkelstroter.cardapio.DTO.FoodDTO;
import com.sergiowinkelstroter.cardapio.Repositories.FoodRepository;
import com.sergiowinkelstroter.cardapio.entities.FoodEntity;



@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping("/")
    public void createFood(@RequestBody CreateFoodDTO data) {
        FoodEntity foodData = new FoodEntity(data);
        foodRepository.save(foodData);
        return;
    }

    @GetMapping("/")
    public List<FoodDTO> getAll(){
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new).toList();      
        return foodList;
    }

}

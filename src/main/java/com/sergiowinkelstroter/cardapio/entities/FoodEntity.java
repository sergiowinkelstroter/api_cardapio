package com.sergiowinkelstroter.cardapio.entities;



import com.sergiowinkelstroter.cardapio.DTO.CreateFoodDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String price;
    private String image;

    public FoodEntity(CreateFoodDTO data){
        this.name = data.name();
        this.price = data.price();
        this.image = data.image();
    }

}

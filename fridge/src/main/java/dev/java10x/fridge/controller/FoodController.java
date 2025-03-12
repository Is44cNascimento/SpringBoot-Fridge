package dev.java10x.fridge.controller;


import dev.java10x.fridge.model.Food;
import dev.java10x.fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {


    //injeção de dependência

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //GET
    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }

    //POST
    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }


    //PUT



    //DELETE
    @DeleteMapping
    public Food delete (@RequestBody Food food){
        return  foodService.Delete(food.getId());
    }

}

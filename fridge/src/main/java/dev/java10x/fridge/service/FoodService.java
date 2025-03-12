package dev.java10x.fridge.service;


import dev.java10x.fridge.model.Food;
import dev.java10x.fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

private final FoodRepository foodRepository;


    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //LISTAR
    public List<Food> getAll(){
        return foodRepository.findAll();
    }


    //CRIAR
    public Food save(Food food) {
    return foodRepository.save(food);
    }

    //DELETAR

    public Food Delete(long id){
        foodRepository.deleteById(id);
        return null;
    }

}

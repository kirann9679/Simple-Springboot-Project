package com.example.demo.Service;


import com.example.demo.Models.Animal;
import com.example.demo.Models.Request.RequestAnimal;


public interface AnimalService {
     Animal saveAnimal(RequestAnimal requestAnimal);
     String deleteAnimal(long id);
}

package com.example.demo.Service.impl;

import com.example.demo.Models.Animal;
import com.example.demo.Models.Request.RequestAnimal;
import com.example.demo.Repository.Repository;
import com.example.demo.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnimalServiceImpl implements AnimalService {
  @Autowired
  Animal animal;
  @Autowired
  Repository repository;
    @Override
    public Animal saveAnimal(RequestAnimal requestAnimal) {
        animal.setId(requestAnimal.getId());
        animal.setName(requestAnimal.getName());
        animal.setLife(requestAnimal.getLife());
        return animal;
    }

    @Override
    public String deleteAnimal(long id) {
Animal animal=repository.getOne(id);
repository.delete(animal);
return "Deleted";
    }
}

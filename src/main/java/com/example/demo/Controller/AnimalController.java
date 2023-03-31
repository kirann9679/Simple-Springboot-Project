package com.example.demo.Controller;

import com.example.demo.Models.Animal;
import com.example.demo.Models.Request.RequestAnimal;
import com.example.demo.Repository.Repository;
import com.example.demo.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AnimalController {
    @Autowired
    AnimalService saveAnimalService;
    @Autowired
    Repository repository;
    @RequestMapping(value={"/getAnimal","/getAnimal1"}, method =  {RequestMethod.POST, RequestMethod.GET})
    public List<Animal> getAnimal(){
       return repository.findAll();
    }

    @PostMapping("/saveAnimal")
    public Animal saveAnimal(@RequestBody RequestAnimal requestAnimal){
        return repository.save(saveAnimalService.saveAnimal(requestAnimal));

    }
    @PutMapping("/updateAnimal")
    public Animal updateAnimal(@RequestBody RequestAnimal requestAnimal){
        return repository.save(saveAnimalService.saveAnimal(requestAnimal));
    }

    // Deleting data using pathvariable
    @DeleteMapping("/deleteAnimal/{id}")
        public String deleteAnimal(@PathVariable long id){
       return saveAnimalService.deleteAnimal(id);
        }

        @GetMapping("/getusingreqparam")
    public String getusingreqparam(@RequestParam long id){
        return "my id is"+id+"";
        }

}


//camelCase, helloWorld, only for java classes HelloSunnyWorld

//snake_casing_with_
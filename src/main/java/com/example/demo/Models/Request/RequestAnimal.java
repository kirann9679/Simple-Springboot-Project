package com.example.demo.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestAnimal {
   private long id;
    private int life;
    private String name;

}

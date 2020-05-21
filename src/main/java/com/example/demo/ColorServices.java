package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class ColorServices {
    public int generateNum(){
        Random rnd = new Random();
        int x = rnd.nextInt(2);

        return x;
    }
}

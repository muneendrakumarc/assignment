package com.assignment.model.bird;

import com.assignment.model.Bird;
import com.assignment.strategy.fly.CanNotFly;
import com.assignment.strategy.sing.ChickenSound;

import lombok.Data;

@Data
public class Chicken extends Bird {

    public Chicken() {
        this.singable = new ChickenSound();
        this.flyable = new CanNotFly();
    }
}

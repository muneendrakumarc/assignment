package com.assignment.model;

import com.assignment.strategy.fly.CanFly;
import com.assignment.strategy.sing.CanSing;
import com.assignment.walk.CanWalk;

import lombok.Data;

@Data
public class Bird extends LivingThing {

    public Bird() {
        this.walkable = new CanWalk();
        this.flyable = new CanFly();
        this.singable = new CanSing();
    }
}
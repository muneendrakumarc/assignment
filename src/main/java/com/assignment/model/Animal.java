package com.assignment.model;

import com.assignment.walk.CanWalk;

import lombok.Data;

@Data
public class Animal extends LivingThing {

    public Animal() {
        this.walkable = new CanWalk();
    }
}

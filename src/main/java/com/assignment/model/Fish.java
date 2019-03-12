package com.assignment.model;

import com.assignment.strategy.sing.CanNotSing;
import com.assignment.strategy.swim.CanSwim;
import com.assignment.util.Color;
import com.assignment.util.Size;
import com.assignment.walk.CanNotWalk;

import lombok.Data;

@Data
public class Fish extends LivingThing {

    protected Size size;
    protected Color color;

    public Fish() {
        this.swimmable = new CanSwim();
        this.walkable = new CanNotWalk();
        this.singable = new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}

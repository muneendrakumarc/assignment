package com.assignment.model.fish;

import com.assignment.model.Fish;
import com.assignment.model.LivingThing;
import com.assignment.strategy.swim.GreatSwimmers;

import lombok.Data;

@Data
public class Dolphin extends LivingThing {

    Fish fish;

    public Dolphin() {
        this.swimmable = new GreatSwimmers();
        this.fish = new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}

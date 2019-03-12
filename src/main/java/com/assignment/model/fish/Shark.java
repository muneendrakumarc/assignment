package com.assignment.model.fish;

import com.assignment.model.Fish;
import com.assignment.util.Color;
import com.assignment.util.Size;

import lombok.Data;

@Data
public class Shark extends Fish {

    public Shark() {
        this.size = Size.LARGE;
        this.color = Color.GREY;
    }
}

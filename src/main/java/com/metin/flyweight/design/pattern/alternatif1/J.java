package com.metin.flyweight.design.pattern.alternatif1;

public class J implements Piece {

    private String label;

    public J(){
        label = "J";
    }

    public void create(String color, int speed, boolean irreversible) {

        System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);
    }
}

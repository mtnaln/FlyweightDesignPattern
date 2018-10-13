package com.metin.flyweight.design.pattern.alternatif2;

public abstract class Piece {

    protected String label;

    public void create(String color, int speed, boolean irreversible) {

        System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);
    }
}

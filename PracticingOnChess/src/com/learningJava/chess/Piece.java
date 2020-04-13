package com.learningJava.chess;

public abstract class Piece {
    private Field position;
    public abstract void eat(Piece piece);
    public abstract void move(Field field);
    public void setPosition(Field field) {
        position = field;
    }
}

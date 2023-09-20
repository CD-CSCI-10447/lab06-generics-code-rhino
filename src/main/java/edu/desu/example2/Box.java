package edu.desu.example2;

import java.util.ArrayList;

public class Box<E> {

    private E item;

    public Box(E item){
        this.item = item;
    }

    public E removeItem(){
        return item;
    }

    public static void main(String[] args) {
        Box<String> strings = new Box<>("First String");
        Box<Integer> integerBox = new Box<>(1);
        Box<Double> doubleBox = new Box<>(2.0);
    }
}

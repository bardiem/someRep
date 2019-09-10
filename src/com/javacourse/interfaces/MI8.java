package com.javacourse.interfaces;

public class MI8 extends Helicopter implements VerticalTakeoff {
    @Override
    public void fly() {
        System.out.println("mi8!");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("VERTICAL!");
    }
}

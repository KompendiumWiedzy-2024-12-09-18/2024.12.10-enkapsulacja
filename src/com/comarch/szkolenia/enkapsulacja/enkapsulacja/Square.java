package com.comarch.szkolenia.enkapsulacja.enkapsulacja;

public class Square {
    private int side;
    private int field;
    private int circle;

    public Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = side * 4;
    }

    public int getSide() {
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircle() {
        return this.circle;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side*side;
        this.circle = side*4;
    }

    public void calculate() {
        k1();
        k2();
        k3();
    }

    private void k1() {
        //k1
    }

    private void k2() {
        //k2
    }

    private void k3() {
        //k3
    }
}

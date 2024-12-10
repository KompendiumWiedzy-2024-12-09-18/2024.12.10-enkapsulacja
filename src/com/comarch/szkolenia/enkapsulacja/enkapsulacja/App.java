package com.comarch.szkolenia.enkapsulacja.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());

        square.setSide(7);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());

        Client c = new Client("Janusz", "Kowalski", 20);

        c.setAge(30);

        c.name = "asd";

        square.calculate();
    }
}

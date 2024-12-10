package com.comarch.szkolenia.enkapsulacja.enkapsulacja;

public class Client {
    protected String name;
    private String surname;
    private int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120) {
            System.out.println("Nie można tak ustawić !!");
        }
        this.age = age;
    }
}

package com.company;

public class BMW extends Car {
    private String color;
    private int year;

    public BMW (String color, int year, String name){
        super(name);
        this.color = color;
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    @Override
    public void print() {
        System.out.println("Автомобиль " + getName() + " " + "цвет"
                + " " + getColor() + " " + "год " + getYear());
    }
}

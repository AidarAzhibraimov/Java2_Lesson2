package com.company;

import javax.xml.namespace.QName;

public class Toyota extends Car{
    private String model;
    private int carCase;

    public Toyota (String model, int carCase,String name){
        super(name);
        this.model = model;
        this.carCase = carCase;
    }
    public String getModel() {
        return model;
    }
    public int getCarCase() {
        return carCase;
    }
    @Override
    public void print() {
        System.out.println( "Автомобиль " + getName() + " модель " + getModel() + " кузов " + getCarCase());
    }
}

package com.company;

public abstract class Car implements Printable{
    private String name;

    public Car (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

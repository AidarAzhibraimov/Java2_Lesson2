package com.company;

public class Mercedes extends Car{
    private int volume;
    private String transmission;

    public Mercedes (int volume, String transmission, String name){
        super(name);
        this.volume = volume;
        this.transmission = transmission;
    }
    public int getVolume() {
        return volume;
    }

    public String getTransmission() {
        return transmission;
    }
    @Override
    public void print() {
        System.out.println( "Автомобиль " + getName() + " " + "объём"
                + " " + getVolume() + " " + "коробка " + getTransmission());
    }
}

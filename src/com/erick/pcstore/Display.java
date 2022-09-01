package com.erick.pcstore;

import java.util.StringJoiner;

public class Display {
    private final int idDisplay;
    private String brand;
    private double inches;
    private static int counterIdDisplay;

    private Display() {
        this.idDisplay = counterIdDisplay++;
    }

    public Display(String brand, double inches) {
        this();
        this.brand = brand;
        this.inches = inches;
    }

    public int getIdDisplay() {
        return idDisplay;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Display.class.getSimpleName() + "[", "]")
                .add("\nidDisplay=" + idDisplay)
                .add("\nbrand='" + brand + "'")
                .add("\ninches=" + inches)
                .toString();
    }
}

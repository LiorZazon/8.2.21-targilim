package com.company;

import lombok.Getter;
import lombok.Setter;

public class  Car {
    private @Getter @Setter String model;
    private @Getter @Setter String brand;
    private @Getter @Setter int year;
    private @Getter @Setter String color;

    public Car (String model, String brand, int year, String color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.Go();
    }

    public void Go() {
        System.out.println("whatever you want");
    }
}

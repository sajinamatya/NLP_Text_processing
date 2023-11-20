
package com.datastructure2023.week2;

/**
 *
 * @author Dell
 */
public class week2 {
    String model, brand, color;
    int prize, quantity;
    Boolean bluelight;

    public week2(String model, String brand, String color, int prize, int quantity, Boolean bluelight) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.prize = prize;
        this.quantity = quantity;
        this.bluelight = bluelight;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrize() {
        return prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public Boolean getBluelight() {
        return bluelight;
    }

   
    
}

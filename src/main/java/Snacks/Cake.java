package Snacks;

import Behaviours.ISell;

public class Cake extends Snack implements ISell {

    private String topping;

    public Cake(String name, String type, String madeFrom, double costPrice, double retailPrice, String topping){
        super(name, type, madeFrom, costPrice, retailPrice);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}

package Snacks;

import Behaviours.ISell;

public class Sandwich extends Snack implements ISell {

    private String filling;

    public Sandwich(String name, String type, String madeFrom, double costPrice, double retailPrice, String filling){
        super(name, type, madeFrom, costPrice, retailPrice);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

}

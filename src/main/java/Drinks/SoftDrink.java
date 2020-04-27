package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;

public class SoftDrink extends Drink implements ISell {


    private String labelColour;

    public SoftDrink(String name, String origin, String flavour, double costPrice, double retailPrice, String labelColour){
        super(name, origin, flavour, costPrice, retailPrice);
        this.labelColour = labelColour;
    }

    public String getLabelColour() {
        return labelColour;
    }

    public void setLabelColour(String labelColour) {
        this.labelColour = labelColour;
    }
}

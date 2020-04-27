package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;

public class Coffee extends Drink implements ISell, IWater {

    private String typeOfBeans;

    public Coffee(String name, String origin, String flavour, double costPrice, double retailPrice, String typeOfBeans){
        super(name, origin, flavour, costPrice, retailPrice);
        this.typeOfBeans = typeOfBeans;
    }

    public String getTypeOfBeans() {
        return typeOfBeans;
    }

    public void setTypeOfBeans(String typeOfBeans) {
        this.typeOfBeans = typeOfBeans;
    }

}



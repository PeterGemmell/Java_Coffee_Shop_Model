package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;

public class Tea extends Drink implements ISell, IWater {

    private String typeOfLeaf;

    public Tea(String name, String origin, String flavour, double costPrice, double retailPrice, String typeOfLeaf){
        super(name, origin, flavour, costPrice, retailPrice);
        this.typeOfLeaf = typeOfLeaf;
    }

    public String getTypeOfLeaf() {
        return typeOfLeaf;
    }

    public void setTypeOfLeaf(String typeOfLeaf) {
        this.typeOfLeaf = typeOfLeaf;
    }
}

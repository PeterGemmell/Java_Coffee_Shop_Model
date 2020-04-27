package Drinks;

public abstract class Drink {

    private String name;
    private String origin;
    private String flavour;
    private double costPrice;
    private double retailPrice;

    public Drink(String name, String origin, String flavour, double costPrice, double retailPrice){

        this.name = name;
        this.origin = origin;
        this.flavour = flavour;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}

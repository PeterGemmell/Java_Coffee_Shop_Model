package Snacks;

public abstract class Snack {

    private String name;
    private String type;
    private String madeFrom;
    private double costPrice;
    private double retailPrice;

    public Snack(String name, String type, String madeFrom, double costPrice, double retailPrice){
        this.name = name;
        this.type = type;
        this.madeFrom = madeFrom;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
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

    public double calculateMarkup(){
        return this.retailPrice -= this.costPrice;
    }

}

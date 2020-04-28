import Behaviours.ISell;
import Drinks.Drink;
import Snacks.Snack;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> drinks;
    private ArrayList<Snack> snacks;

    public Shop(){
        snacks = new ArrayList<Snack>();
        this.drinks = new ArrayList<ISell>();
    }

    public void addDrink(ISell drink){
        drinks.add(drink);
    }

    public void addSnacks(Snack snacks){
        this.snacks.add(snacks);
    }

    public int getDrinkCount(){
        return this.drinks.size();
    }

    public int getSnackCount(){
        return this.snacks.size();
    }

    public void removeDrink(Drink drink){
        this.drinks.remove(drink);
    }

    public void removeSnacks(Snack snacks){
        this.snacks.remove(snacks);
    }

    public ArrayList<ISell> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<ISell> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }
}

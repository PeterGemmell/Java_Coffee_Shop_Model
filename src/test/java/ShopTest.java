import Drinks.Coffee;
import Drinks.Tea;
import Snacks.Sandwich;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Coffee cappuccino;
    Sandwich hamSalad;
    Tea earlGrey;

    @Before
    public void setUp() throws Exception{
        shop = new Shop();
        cappuccino = new Coffee("Cappuccino", "Italy", "Bold", 0.50, 3.50, "Sumatra");
        hamSalad = new Sandwich("Ham Salad", "Savory", "White Bread", 0.30, 4.50, "Ham, Tomato and Salad");
        earlGrey = new Tea("Earl Grey", "China", "Fruity", 0.40, 3.00, "Black");
        shop.addDrink(cappuccino);
        shop.addDrink(earlGrey);
        shop.removeDrink(earlGrey);
        shop.addSnacks(hamSalad);

    }

    @Test
    public void canAddDrinkToStock(){
        shop.addDrink(cappuccino);
        assertEquals(2,shop.getDrinkCount());
    }

    @Test
    public void canAddSnackToStock(){
        shop.addSnacks(hamSalad);
        assertEquals(2,shop.getSnackCount());
    }

    @Test
    public void canRemoveDrinkFromStock(){
        shop.removeDrink(cappuccino);
        assertEquals(0,shop.getDrinkCount());
    }

    @Test
    public void canRemoveSnackFromStock(){
        shop.removeSnacks(hamSalad);
        assertEquals(0, shop.getSnackCount());
    }
}

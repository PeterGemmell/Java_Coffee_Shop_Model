package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoftDrinkTest {

    SoftDrink softDrink;
    ISell markup;

    @Before
    public void before(){
        softDrink = new SoftDrink("Coca Cola", "U.S.A", "Tasty", 0.50, 2.50, "Red");
    }

    @Test
    public void getName(){
        assertEquals("Coca Cola", softDrink.getName());
    }

    @Test
    public void cocaColaHasLabelColour(){
        assertEquals("Red", softDrink.getLabelColour());
    }

    @Test
    public void cocaColaHasCostPrice(){
        assertEquals(0.50, softDrink.getCostPrice(), 0.01);
    }

    @Test
    public void cocaColaHasRetailPrice(){
        assertEquals(2.50, softDrink.getRetailPrice(), 0.01);
    }

    @Test
    public void cocaColaMarkUpPrice(){
        assertEquals(2.00, softDrink.calculateMarkup(), 0.01);
    }
}

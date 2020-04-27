package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoftDrinkTest {

    SoftDrink cocaCola;
    ISell markup;

    @Before
    public void before(){
        cocaCola = new SoftDrink("Coca Cola", "U.S.A", "Tasty", 0.50, 2.50, "Red");
    }

    @Test
    public void getName(){
        assertEquals("Coca Cola", cocaCola.getName());
    }

    @Test
    public void cocaColaHasLabelColour(){
        assertEquals("Red", cocaCola.getLabelColour());
    }

    @Test
    public void cocaColaHasCostPrice(){
        assertEquals(0.50, cocaCola.getCostPrice(), 0.01);
    }

    @Test
    public void cocaColaHasRetailPrice(){
        assertEquals(2.50, cocaCola.getRetailPrice(), 0.01);
    }

    @Test
    public void cocaColaMarkUpPrice(){
        assertEquals(2.00, cocaCola.calculateMarkup(), 0.01);
    }
}

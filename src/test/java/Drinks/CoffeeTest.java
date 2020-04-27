package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeTest {

    Coffee cappuccino;
    Coffee flatWhite;
    ISell markup;
    IWater full;


    @Before
    public void before(){
        cappuccino = new Coffee("Cappuccino", "Italy", "Bold", 0.50, 3.50, "Sumatra");
        flatWhite = new Coffee("Flat White", "San Francisco", "Strong", 0.50, 3.50, "Robusto");

    }

    @Test
    public void getName(){
        assertEquals("Cappuccino", cappuccino.getName());
    }

    @Test
    public void getFlatWhite(){
       assertEquals("Flat White", flatWhite.getName());
    }

    @Test
    public void cappuccinoHasTypeOfBeans(){
        assertEquals("Sumatra", cappuccino.getTypeOfBeans());
    }

    @Test
    public void cappuccinoFillUp(){
        assertEquals("full", cappuccino.fillUp());
    }

    @Test
    public void cappuccinoHasCostPrice(){
        assertEquals(0.50, cappuccino.getCostPrice(), 0.01);
    }
    @Test
    public void cappuccinoHasRetailPrice(){
        assertEquals(3.50, cappuccino.getRetailPrice(), 0.01);
    }

    @Test
    public void cappuccinoMarkUpPrice(){
        assertEquals(3.00, cappuccino.calculateMarkup(), 0.01);
    }

}

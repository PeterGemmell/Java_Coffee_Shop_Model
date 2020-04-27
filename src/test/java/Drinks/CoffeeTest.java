package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeTest {

    Coffee coffee;
    ISell markup;
    IWater full;


    @Before
    public void before(){
        coffee = new Coffee("Cappuccino", "Italy", "Bold", 0.50, 3.50, "Sumatra");

    }

    @Test
    public void getName(){
        assertEquals("Cappuccino", coffee.getName());
    }

    @Test
    public void cappuccinoHasTypeOfBeans(){
        assertEquals("Sumatra", coffee.getTypeOfBeans());
    }

    @Test
    public void cappuccinoFillUp(){
        assertEquals("full", coffee.fillUp());
    }

    @Test
    public void cappuccinoHasCostPrice(){
        assertEquals(0.50, coffee.getCostPrice(), 0.01);
    }
    @Test
    public void cappuccinoHasRetailPrice(){
        assertEquals(3.50, coffee.getRetailPrice(), 0.01);
    }

    @Test
    public void cappuccinoMarkUpPrice(){
        assertEquals(3.00, coffee.calculateMarkup(), 0.01);
    }
}

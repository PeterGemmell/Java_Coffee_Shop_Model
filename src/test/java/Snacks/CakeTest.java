package Snacks;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CakeTest {

    Cake cheeseCake;
    ISell markup;

    @Before
    public void before(){
        cheeseCake = new Cake("Cheesecake", "Sweet", "Cream and Biscuit", 1.00, 4.00, "Strawberries");
    }

    @Test
    public void getName(){
        assertEquals("Cheesecake", cheeseCake.getName());
    }

    @Test
    public void cheeseCakeHasTopping(){
        assertEquals("Strawberries", cheeseCake.getTopping());
    }

    @Test
    public void cheeseCakeHasCostPrice(){
        assertEquals(1.00, cheeseCake.getCostPrice(), 0.01);
    }

    @Test
    public void cheeseCakeHasRetailPrice(){
        assertEquals(4.00, cheeseCake.getRetailPrice(), 0.01);
    }

    @Test
    public void cheeseCakeMarkUpPrice(){
        assertEquals(3.00, cheeseCake.calculateMarkup(), 0.01);
    }
}

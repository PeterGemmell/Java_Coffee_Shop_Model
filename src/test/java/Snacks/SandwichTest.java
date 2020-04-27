package Snacks;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SandwichTest {

    Sandwich hamSalad;
    ISell markup;

    @Before
    public void before(){
        hamSalad = new Sandwich("Ham Salad", "Savory", "White Bread", 0.30, 4.50, "Ham, Tomato and Salad");
    }

    @Test
    public void getName(){
        assertEquals("Ham Salad", hamSalad.getName());
    }

    @Test
    public void hamSaladSandwichHasFilling(){
        assertEquals("Ham, Tomato and Salad", hamSalad.getFilling());
    }

    @Test
    public void hamSaladSandwichHasCostPrice(){
        assertEquals(0.30, hamSalad.getCostPrice(), 0.01);
    }

    @Test
    public void hamSaladSandwichHasRetailPrice(){
        assertEquals(4.50, hamSalad.getRetailPrice(), 0.01);
    }

    @Test
    public void hamSaladSandwichMarkUp(){
        assertEquals(4.20, hamSalad.calculateMarkup(), 0.01);
    }
}

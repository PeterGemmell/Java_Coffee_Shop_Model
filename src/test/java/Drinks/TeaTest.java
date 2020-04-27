package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeaTest {

    Tea tea;
    ISell markup;
    IWater full;

    @Before
    public void before(){
        tea = new Tea("Earl Grey", "China", "Fruity", 0.40, 3.00, "Black");
    }

    @Test
     public void getName(){
        assertEquals("Earl Grey", tea.getName());
        System.out.println("Earl Grey");
    }

    @Test
    public void earlGreyHasTypeOfLeaf(){
        assertEquals("Black", tea.getTypeOfLeaf());
    }

    @Test
    public void earlGreyFillUp(){
        assertEquals("full", tea.fillUp());
    }

    @Test
    public void earlGreyHasCostPrice(){
        assertEquals(0.40, tea.getCostPrice(), 0.01);
    }

    @Test
    public void earlGreyHasRetailPrice(){
        assertEquals(3.00, tea.getRetailPrice(), 0.01);
    }

    @Test
    public void earlGreyMarkUpPrice(){
        assertEquals(2.60, tea.calculateMarkup(), 0.01);
    }
}

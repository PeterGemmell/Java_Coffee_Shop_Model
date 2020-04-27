package Drinks;

import Behaviours.ISell;
import Behaviours.IWater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeaTest {

    Tea earlGrey;
    ISell markup;
    IWater full;

    @Before
    public void before(){
        earlGrey = new Tea("Earl Grey", "China", "Fruity", 0.40, 3.00, "Black");
    }

    @Test
     public void getName(){
        assertEquals("Earl Grey", earlGrey.getName());
        System.out.println("Earl Grey");
    }

    @Test
    public void earlGreyHasTypeOfLeaf(){
        assertEquals("Black", earlGrey.getTypeOfLeaf());
    }

    @Test
    public void earlGreyFillUp(){
        assertEquals("full", earlGrey.fillUp());
    }

    @Test
    public void earlGreyHasCostPrice(){
        assertEquals(0.40, earlGrey.getCostPrice(), 0.01);
    }

    @Test
    public void earlGreyHasRetailPrice(){
        assertEquals(3.00, earlGrey.getRetailPrice(), 0.01);
    }

    @Test
    public void earlGreyMarkUpPrice(){
        assertEquals(2.60, earlGrey.calculateMarkup(), 0.01);
    }
}

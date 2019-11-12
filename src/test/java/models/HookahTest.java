package models;

import org.junit.Assert;
import org.junit.Test;

public class HookahTest {
    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Khalil Mahmoon";

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setBrand(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getBrand());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        Double expected = 100.0;

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getPrice());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        Integer expected = 9;

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        Integer expected = 3;

        // when (2)
        Hookah hookah2 = new Hookah();
        hookah2.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, hookah2.getQty());
    }



}

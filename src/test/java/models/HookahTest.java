package models;

import org.junit.Assert;
import org.junit.Test;

public class HookahTest {

    @Test
    public void setIdTest() {
        // given (1)
        Integer expected = 1001;

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setId(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Khalil Mamoon";

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setBrand(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getBrand());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        String expected = "Small";

        // when (2)
        Hookah hookah1 = new Hookah();
        hookah1.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, hookah1.getSize());
    }

//    @Test
//    public void setQtyTest() {
//        // given (1)
//        Integer expected = 3;
//
//        // when (2)
//        Hookah hookah2 = new Hookah();
//        hookah2.setQty(expected);
//
//        // then (3)
//        Assert.assertEquals(expected, hookah2.getQty());
//    }

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

    @Test // (1)
    public void constructorTest(){

        // (2)
        Integer expectedId = 1001;
        String expectedBrand = "Khalil Mamoon";
        String expectedSize = "Small";
        Double expectedPrice = 100.00;

        // (3)
        Hookah testHookah = new Hookah (expectedId, expectedBrand, expectedSize);
//
        // (4)
        Assert.assertEquals(expectedId, testHookah.getId());
        Assert.assertEquals(expectedBrand, testHookah.getBrand());
        Assert.assertEquals(expectedSize, testHookah.getSize());
        Assert.assertEquals(expectedPrice, testHookah.getPrice());
    }

}

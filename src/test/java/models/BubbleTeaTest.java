package models;

import org.junit.Assert;
import org.junit.Test;

public class BubbleTeaTest {
    @Test
    public void setFlavor() {
        // given (1)
        String expected = "Passion Fruit";

        // when (2)
        BubbleTea bubbleTeaTest = new BubbleTea();
        bubbleTeaTest.setFlavor(expected);

        // then (3)
        Assert.assertEquals(expected, bubbleTeaTest.getFlavor());
    }

    @Test
    public void setSize() {
        // given (1)
        String expected = "Large";

        // when (2)
        BubbleTea bubbleTeaTest = new BubbleTea();
        bubbleTeaTest.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, bubbleTeaTest.getSize());
    }

    @Test
    public void setQty() {
        // given (1)
        Integer expected = 2;

        // when (2)
        BubbleTea bubbleTeaTest = new BubbleTea();
        bubbleTeaTest.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, bubbleTeaTest.getQty());
    }

    @Test
    public void setPrice() {
        // given (1)
        Double expected = 5.00;

        // when (2)
        BubbleTea bubbleTeaTest = new BubbleTea();
        bubbleTeaTest.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, bubbleTeaTest.getPrice());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        String expectedFlavor = "Passion Fruit";
        String expectedSize = "Medium";
        Integer expectedQty = 2;
        Double expectedPrice = 5.00;

        // (3)
        BubbleTea bubbleTeaTest = new BubbleTea (expectedFlavor, expectedSize, expectedQty, expectedPrice);
//
        // (4)
        Assert.assertEquals(expectedFlavor, bubbleTeaTest.getFlavor());
        Assert.assertEquals(expectedSize, bubbleTeaTest.getSize());
        Assert.assertEquals(expectedQty, bubbleTeaTest.getQty());
        Assert.assertEquals(expectedPrice, bubbleTeaTest.getPrice());
    }



}

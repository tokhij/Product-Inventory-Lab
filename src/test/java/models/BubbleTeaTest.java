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



}

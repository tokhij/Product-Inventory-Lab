package services;

import models.Hookah;
import org.junit.Assert;
import org.junit.Test;

public class HookahServiceTest {
    @Test
    public void createTest(){

        // (1) We create some test data that we will use to create a test Hookah.
        Integer expectedId = 2;
        String expectedBrand = "Khalil Mamoon";
        String expectedSize = "Small";
        Double expectedPrice = 100.00;

        // (2) First I instantiate a hookahService object. Then I will use create(arg1, arg2, arg3...) to have the service create and return a new sneaker object.
        HookahService testHookahService = new HookahService();
        Hookah testHookah = testHookahService.create(expectedBrand, expectedSize);

        // (3) Using accessor methods to capture the data from the newly created hookah.
        Integer actualId = testHookah.getId();
        String actualBrand = testHookah.getBrand();
        String actualSize = testHookah.getSize();
        Double actualPrice = testHookah.getPrice();

        // (4) Check/Assert that the data passed into the HookahService was properly assigned to the new hookah object returned.
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testFindHookahById(){
        HookahService hookahServiceTest = new HookahService();
        Hookah hookah1 = hookahServiceTest.create("Khalil Mamoon", "Small");
        Hookah expectedHookah = hookahServiceTest.create("Maya", "Small");

        Hookah actualHookah = hookahServiceTest.findHookahById(3);
        System.out.println(actualHookah);
        Assert.assertEquals(expectedHookah, actualHookah);
    }

    @Test
    public void testFindAllHookahs(){
        //declare hookah
        HookahService hookahServiceTest = new HookahService();
        //create hookah 1
        Hookah hookah1 = hookahServiceTest.create("Khalil Mamoon", "Small");
        //create hookah 2
        Hookah hookah2 = hookahServiceTest.create("Khalil Mamoon", "Small");
        //create hookah 3
        Hookah hookah3 = hookahServiceTest.create("Khalil Mamoon", "Small");
        //create hookah array expected made out of the above
        Hookah[] expectedHookah = {hookah1, hookah2, hookah3};
        //hookah find all is actual array.
        Hookah[] actualHookah = hookahServiceTest.findAll();
        System.out.println(actualHookah.toString());

        Assert.assertArrayEquals(expectedHookah, actualHookah);

    }

    @Test
    public void removeHookahByIdTest() {
        HookahService hookahServiceTest = new HookahService();
        Hookah hookah1 = hookahServiceTest.create("Khalil Mamoon", "Small");
        Hookah expectedHookah = hookahServiceTest.create("Maya", "Small");

        boolean hookahActual = hookahServiceTest.delete(54);
        System.out.println(hookahActual);
        Assert.assertTrue(hookahActual);
    }





}












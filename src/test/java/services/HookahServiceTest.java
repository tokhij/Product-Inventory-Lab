package services;

import models.Hookah;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HookahServiceTest {

    public class SneakerTest {

        @Test
        public void setBrandTest() {
            // given (1)
            String expected = "Khalil Mahmoon";

            // when (2)
            Hookah hookah1 = new Hookah();
            hookah1.setBrand(expected);

            // then (3)
            Assertions.assertEquals(expected, hookah1.getBrand());
        }
    }










}

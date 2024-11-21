package com.bolotov.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoffeeFactoryTest {

    CoffeeFactory coffeeFactory = new CoffeeFactory();

    @Test
    @DisplayName("Test make coffee functionality")
    public void givenCoffeeType_whenMakeCoffee_thenReturnCoffee() {
        //given
        CoffeeType coffeeType = CoffeeType.ESPRESSO;

        //when
        Coffee coffee = coffeeFactory.makeCoffee(coffeeType);

        //then
        assertThat(coffee).isNotNull();
        assertThat(coffee).isInstanceOf(Espresso.class);
    }
}
package com.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order = new Order(5,"Headphones",2000.50);
    @Test
    void testGetQuantity() {
            //given
            int expectedQuantity = 5;
            //when
            int actual = order.getQuantity();
            //then
            assertTrue(actual==expectedQuantity);
    }

    @Test
    void testSetQuantity() {
            //given
            int expected = 3;
            //when
          order.setQuantity(3);
            //then
            assertTrue(order.getQuantity()==expected);
    }

    @Test
    void testSetItemName() {
        //given
        String expectedItem = "Headphones";
        //when
        order.setItemName("Headphones");
        //then
        assertEquals(expectedItem,order.getItemName());
    }

    @Test
    void testGetItemName() {
        //given
        String expectedItemName = "Headphones";
        //when
        String actualItemName = order.getItemName();
        //then
        assertTrue(expectedItemName.equals(actualItemName));
    }

    @ParameterizedTest
    @ValueSource(doubles = {10.00, 2000.50, 30.00})
    void testGetPrice(double expected){
        assertEquals(expected,order.getPrice());
    }

    @Test
    void testSetPrice() {
        //given
        double expectedPrice = 2000.50;
        //when
        order.setPrice(2000.50);
        //then
        assertEquals(expectedPrice,order.getPrice());
    }

    @Test
    void testGetPriceWithTex() {
        //given
        double expectedPriceWithTex = 3000.50;
        //when
        order.setPriceWithTex(3000.50);
        //then
        assertEquals(expectedPriceWithTex,order.getPriceWithTex());
    }

}
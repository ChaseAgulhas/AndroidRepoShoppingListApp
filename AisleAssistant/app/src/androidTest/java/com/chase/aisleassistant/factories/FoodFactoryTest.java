package com.chase.aisleassistant.factories;

import com.chase.aisleassistant.factories.products.FoodFactory;

import junit.framework.TestCase;

/**
 * Created by Chase on 2016-04-21.
 */
public class FoodFactoryTest extends TestCase {

    public void testFoodType() throws Exception {
        String food = FoodFactory.getFoodType("vegetable");
        System.out.println(food);
    }
}
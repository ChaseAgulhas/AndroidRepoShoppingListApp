package com.chase.aisleassistant.factories.products;

import com.chase.aisleassistant.domain.products.Bread;
import com.chase.aisleassistant.domain.products.Food;
import com.chase.aisleassistant.domain.products.Meat;
import com.chase.aisleassistant.domain.products.Vegetables;

/**
 * Created by Chase on 2016-04-21.
 */
public class FoodFactory {

    private static Bread bread;
    private static Meat meat;
    private static Vegetables vegetables;
    private static Food foodChain;

    public static String getFoodType(String type)
    {
        foodChain = setUpNextFoodChain();
        return foodChain.handleFoodRequest(type);
    }

    public static Food setUpNextFoodChain()
    {
        bread = new Bread();
        meat = new Meat();
        vegetables = new Vegetables();

        bread.setNextFood(meat);
        meat.setNextFood(vegetables);
        return bread;
    }

}


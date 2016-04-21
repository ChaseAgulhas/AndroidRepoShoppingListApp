package com.chase.aisleassistant.domain.products;

/**
 * Created by Chase on 2016-04-21.
 */
public abstract class Food {
    Food nextFood;
    public void setNextFood(Food nextFood) {
        this.nextFood = nextFood;
    }
    public abstract String handleFoodRequest(String request);
}

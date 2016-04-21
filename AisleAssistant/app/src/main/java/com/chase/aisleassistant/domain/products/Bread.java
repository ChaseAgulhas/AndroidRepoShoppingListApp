package com.chase.aisleassistant.domain.products;

/**
 * Created by Chase on 2016-04-21.
 */
public class Bread extends Food {
    @Override
    public String handleFoodRequest(String request) {
        if (request.equalsIgnoreCase("bread")) {
            return "This is bread.";
        } else {
            if (nextFood != null) {
                return nextFood.handleFoodRequest(request);
            }
            return "No Food type";
        }
    }
}

package com.chase.aisleassistant.factories.customer;

import com.chase.aisleassistant.domain.customer.User;

/**
 * Created by Chase on 2016-04-21.
 */
public class UserFactory {
    public static User getUser(String name,String surname, String cellphoneNumber)
    {
        return new User.Builder()
                .setName(name)
                .setSurname(surname)
                .setCellphoneNumber(cellphoneNumber)
                .build();
    }
}

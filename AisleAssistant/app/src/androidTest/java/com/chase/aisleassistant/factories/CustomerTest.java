package com.chase.aisleassistant.factories;

import com.chase.aisleassistant.domain.customer.User;
import com.chase.aisleassistant.factories.customer.UserFactory;

import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by Chase on 2016-04-21.
 */
public class CustomerTest {
    @Test
    public void testUser() throws Exception {
        User user = UserFactory.getUser("Chase", "Agulhas", "1111111");
        System.out.printf(user.getCellphoneNumber() + " " + user.getName() + " " + user.getSurname() );
    }
}

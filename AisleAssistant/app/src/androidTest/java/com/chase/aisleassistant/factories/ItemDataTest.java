package com.chase.aisleassistant.factories;

import com.chase.aisleassistant.domain.shopping_list.ItemData;
import com.chase.aisleassistant.factories.shopping_list.ItemDataFactory;

import junit.framework.TestCase;
import org.junit.Test;
/**
 * Created by Chase on 2016-04-21.
 */
public class ItemDataTest {
    @Test
    public void testIteamData() throws Exception {
        ItemData itemData = ItemDataFactory.getItemData("Tomato", "tom101", 4);
        System.out.println(itemData.getName() + "" + itemData.getItemCode() + "" + itemData.getQuantity());
    }
}

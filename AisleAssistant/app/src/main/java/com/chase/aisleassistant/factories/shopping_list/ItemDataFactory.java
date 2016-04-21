package com.chase.aisleassistant.factories.shopping_list;

import com.chase.aisleassistant.domain.shopping_list.ItemData;

/**
 * Created by Chase on 2016-04-21.
 */
public class ItemDataFactory{
    public static ItemData getItemData(String name, String itemCode, int quantity)
    {
        return new ItemData.Builder()
                .setItemCode(itemCode)
                .setName(name)
                .setQuantity(quantity)
                .build();
    }
}

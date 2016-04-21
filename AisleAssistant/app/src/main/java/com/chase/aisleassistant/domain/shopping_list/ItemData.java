package com.chase.aisleassistant.domain.shopping_list;

/**
 * Created by Chase on 2016-04-21.
 */
public class ItemData{

    private long id;
    private String name;
    private String itemCode;
    private int quantity;

    private ItemData(){}

    public ItemData(Builder build) {
        this.id = build.id;
        this.name = build.name;
        this.itemCode = build.itemCode;
        this.quantity = build.quantity;
    }

    public long getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getItemCode() {
        return itemCode;
    }


    public int getQuantity() {
        return quantity;
    }


    public static class Builder {
        private long id;
        private String name;
        private String itemCode;
        private int quantity;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setId(long id)
        {
            this.id = id;
            return this;
        }

        public ItemData build(){
            return new ItemData(this);
        }

        public Builder copyItemData(ItemData itemToBeCopied){
            this.id = itemToBeCopied.id;
            this.name = itemToBeCopied.name;
            this.itemCode = itemToBeCopied.itemCode;
            this.quantity = itemToBeCopied.quantity;
            return this;
        }

    }

}

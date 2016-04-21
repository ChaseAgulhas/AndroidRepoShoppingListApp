package com.chase.aisleassistant.domain.customer;

/**
 * Created by Chase on 2016-04-21.
 */
public class User {
    private long id;
    private String name;
    private String surname;
    private String cellphoneNumber;

    private User(){}

    //insert public constructor
    public User(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.cellphoneNumber = builder.cellphoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public static class Builder
    {
        private long id;
        private String name;
        private String surname;
        private String cellphoneNumber;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setCellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

        public Builder copyItemData(User userToBeCopied){
            this.id = userToBeCopied.id;
            this.name = userToBeCopied.name;
            this.surname = userToBeCopied.surname;
            this.cellphoneNumber = userToBeCopied.cellphoneNumber;
            return this;
        }
    }
}

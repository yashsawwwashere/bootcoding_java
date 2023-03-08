package com.bootcoding.basic.customer;

public class Customer {

    String name ;
    int noShop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoShop() {
        return noShop;
    }

    public void setNoShop(int noShop) {
        this.noShop = noShop;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    int discount;
}

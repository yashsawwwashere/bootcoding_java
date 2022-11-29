package com.bootcoding.Collection.Hashcode;

import java.util.Objects;

public class Restaurant {
    private String name;
    private String address;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Restaurant(String name, String addres, String type){
        this.name=name;
        this.address=address;
        this.type=type;

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Invoked Resturannt Equals() method ");
         return true;


    }

    @Override
    public int hashCode() {
        System.out.println("invoked Resturant Hashcode() method");
        return Objects.hash(name, address, type);
    }
}

package com.bootcoding.java;

import java.util.Comparator;

public class User   {
//getter and setter //tostring
     private String name;
     private int age;
     private long phone;

     public User (String name, int age, long phone) {
         this.name = name;
         this.age = age;
         this.phone = phone;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }



    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }


}




//    @Override
//    public int compareTo(User user) {
//         if(this.getAge()>user.getAge())
//             return 1;
//         else
//             return -1;
//
//    }
//}
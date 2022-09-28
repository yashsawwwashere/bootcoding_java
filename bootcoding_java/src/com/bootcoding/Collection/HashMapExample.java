package com.bootcoding.Collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> emailid=new HashMap<>();
        emailid.put("std-123","iamcoder@gmail.com");
        emailid.put("std-333","iamjavadeveloperr@gmail.com");

       /* String value=emailid.get(key);*/
        String email =emailid.get("std-333");
        System.out.println("value of std-333="+email);
    }
}

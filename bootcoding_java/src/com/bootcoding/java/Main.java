package com.bootcoding.java;


import java.util.*;

public class Main  {
    public static void main(String[] args) {

//            List<String> list = new ArrayList<String>();
//            list.add("Raja");
//            list.add("Banti");
//            list.add("Babu");
//            list.add("Ram");
//            list.add("Babu");
//            list.add("Babli");
//
//            Collections.sort(list);
//            //sort list of the element
//            list.forEach(System.out::println);

        List<User> list = new ArrayList<>();
        list.add(new User("Raja", 12, 989054));
        list.add(new User("Ravi", 22, 765432));
        list.add(new User("Banti", 11, 761209));
        list.add(new User("Ashok", 34, 457891));
        list.add(new User("Nishant", 28, 761209));
        list.add(new User("Veeru", 35, 9821345));
        list.add(new User("Nishant", 27, 997766));

//            //sort list of the element

//        Comparator<User> comp1 = new Comparator<User>(){
//
//            @Override
//            public int compare(User o1, User o2) {
//                if(o1.getAge()>o2.getAge())
//                return 1;
//                else
//                    return -1;
//            }
//        };
        Main.sort(new ArrayList<>());

        for(User user:list)
           System.out.println(user);


    }


//        Collections.sort(list,comp1);
//        for(User user:list)
//            System.out.println(user);

    public static void sort(ArrayList<User>list) {

        list.sort((o1, o2)
                -> o1.getName().compareTo(
                o2.getName()));
    }
    }






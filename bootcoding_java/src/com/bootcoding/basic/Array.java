package com.bootcoding.basic;

public class Array {
    public void number() {
        int a[] = {10, 15, 20, 25, 30};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

    public void words() {
        String[] b = {"Apple", "Avocado", "Grapes", "Pineapple", "Watermelon" };
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

    public void months() {
        String[] c = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    public void even() {
        int a[] = {10, 15, 20, 25, 35,75,80,95};
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.println("no.is even");
            }
            else{
                System.out.println("odd");

            }
        }
    }
    public void reverse(){
        int a[] = {10, 15, 20, 25, 35,75,80,95};
        int n=a.length;
        for (int i = 0; i < a.length/2; i++){
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
    public void valueFound(){
        int user=80;
        int a[] = {10, 15, 20, 25, 35,75,80,95};
        for (int i = 0; i < a.length; i++){
            if(user==a[i]){
                System.out.println("found");
            }



        }
    }



    public static void main(String[]args){
            Array r = new Array();
            r.number();
            r.words();
            r.months();
            r.even();
            r.reverse();
            r.valueFound();

        }
    }





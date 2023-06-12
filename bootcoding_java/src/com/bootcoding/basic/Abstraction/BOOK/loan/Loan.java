package com.bootcoding.basic.Abstraction.BOOK.loan;

public abstract class Loan {
    public String borrow;
    public double intrestrate;

    abstract void buy(double numberofloan);
    public void display(){ // declare + implementation

        System.out.println(borrow);
        System.out.println(intrestrate);
    }
}

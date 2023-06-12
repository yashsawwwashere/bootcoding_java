package com.bootcoding.basic.Abstraction.BOOK.loan;

public class LoanApp {
    public static void main(String[] args) {
        CarLoan carloan=new CarLoan();
        EducationLoan eduLoan=new EducationLoan();
        HomeLoan homeLoan=new HomeLoan();

        carloan.buy(10);
        eduLoan.buy(10);
        homeLoan.buy(10);

        print(carloan);
        print(eduLoan);
        print(homeLoan);

    }
    public static void print(Loan loan){
        loan.display();
    }
}

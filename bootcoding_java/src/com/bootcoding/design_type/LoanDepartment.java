package com.bootcoding.design_type;

public class LoanDepartment {
    public double totalPayableAmount(double amount,int years,double intrest){

        for(int i=0;i<years;i++){

            amount = amount+(amount*0.1);
        }

        return amount;

    }

    public static void main(String[] args) {
        LoanDepartment l = new LoanDepartment();
        double amount=1000;
        int years=5;
        double intrest=10;

        System.out.println( l.totalPayableAmount(amount,years,intrest));

    }
}

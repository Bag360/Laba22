package com.luxoft.training.utils;

import com.luxoft.training.lab2.employees.Payment;
    public class PercentageOfSales extends Payment {
        double rate;
        double salesAmount;
    public PercentageOfSales(String name,String surname,int day,int month,int year,String office,double salesAmount,double rate){
        super(name,surname,day,month,year,office);
        this.rate=rate;
        this.salesAmount=salesAmount;
    }
    @Override
    public void salary(){
        System.out.println( "Payment type: Percentage of sales"+"\nRate: "+rate+"\nSales Amount: "+salesAmount+"\nPayment: "+(salesAmount/100)*(rate)+"\n\n");


    }


}

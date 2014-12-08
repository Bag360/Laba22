package com.luxoft.training.lab2.employees;

import com.luxoft.training.utils.PercentageOfSales;

public class SalaryAndPercentage extends PercentageOfSales{
        double salary;
        double rate;
    double salesAmount;
    public SalaryAndPercentage(String name,String surname,int day,int month,int year,String office,double salesAmount,double rate,double salary){
        super(name,surname,day,month,year,office,salesAmount,rate);
        this.salary=salary;
    }
    @Override
    public void salary(){
        System.out.println("Payment type: Percentage of sales"+"\nRate: "+rate+"\nSales Amount: "+salesAmount+"\nSalary: "+salary+"\nPayment: "+(salesAmount/100)*((rate)+salary)+"\n\n");


    }


}

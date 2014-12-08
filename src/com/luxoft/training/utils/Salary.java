package com.luxoft.training.utils;

import com.luxoft.training.lab2.employees.Payment;
    public class Salary extends Payment{
           double zarplata;
    public Salary(String name,String surname,int day,int month,int year,String office,double zarplata){
           super(name,surname,day,month,year,office);
           this.zarplata=zarplata;
    }
    @Override
    public void salary(){
        System.out.println("Payment type: Salary"+"\nSalary: "+zarplata+"\nPayment: "+zarplata+"\n\n");

    }

}
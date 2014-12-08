package com.luxoft.training.lab2.employees;
    public class HourlyPay extends Payment{
        double salary;
        int hourly;
    public HourlyPay(String name,String surname,int day,int month,int year,String office,int hourly,double salary){
        super(name,surname,day,month,year,office);
        this.salary=salary;
        this.hourly=hourly;
    }
    @Override
    public void salary(){
        System.out.println("Payment type: Hourly Pay"+"\nSalary: "+salary+"\nHourly: "+hourly+"\nPayment: "+ salary*hourly+"\n\n");


    }




}

package com.luxoft.training.lab2;
import com.luxoft.training.lab2.employees.*;
import com.luxoft.training.utils.*;

public class PaymentCalcDemo {



    public static void main(String []args ){
        Payment[] types=new Payment[4];
        types[0] = new Salary("Jason","Kid",23,03,1973,"Coach",3000000);
        types[3] = new SalaryAndPercentage("Michael","Jordan",17,02,1963,"Charlotte Hornets owner",1000000,50,200000);
        types[1] = new HourlyPay("Lebron","James",30,12,1984,"player",24,11415);
        types[2] = new PercentageOfSales("Rich","Paul",16,12,1981,"agent",0.5,23000000);
       
        Utils.sort(types, 0, 3);
        for (int i=0;i<4;i++){
            System.out.print(types[i]+"\n");
            types[i].salary();




        }
    }



}
package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.Date;
abstract public  class Payment {
    private String name;
    private String surname;
    private String office;
    private Date date;

 public Payment(String name,String surname,int day,int month,int year,String office){
    this.name=name;
    this.surname=surname;
    this.office=office;
    this.date=new Date(day,month,year);
 }
    public String getSurname(){

        return surname;
    }
    abstract public void salary();



    @Override
 public String toString(){

    return"Name: "+ this.name+"\n"+"Surname: "+this.surname+"\n"+"Date: "+date+"\n"+"Office: "+this.office;

    }
}
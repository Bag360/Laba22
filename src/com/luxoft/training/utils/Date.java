package com.luxoft.training.utils;

public class Date {
    int year;
    int month;
    int day;
public Date(int day,int month,int year){
   this.day=day;
   this.month=month;
   this.year=year;
}
    public String toString(){
        return day+"."+month+"."+year;
    }


}

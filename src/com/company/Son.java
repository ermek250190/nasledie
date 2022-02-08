package com.company;

public class Son extends  Papa{
    String name;


    public Son(String name, int age, String hobbi, String profession, String name1) {
        super(name, age, hobbi, profession);
        this.name = name1;
    }
    void son(){
        System.out.println("           (..He plan to be in future programmer..)");
    }

    @Override
    public String toString() {

            return "{  SON }.."+".."+name+"..age  .."+age+"..Hobbi . ."+Hobbi+"..profession . .."+Profession+"..name .. "+name;



    }
    }




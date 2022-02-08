package com.company;

public class Papa {
    String name;
    int  age;
    String Hobbi;
    String Profession;

    public Papa() {
    }

    public Papa(String name, int age, String hobbi, String profession) {
        this.name = name;
        this.age = age;
        Hobbi = hobbi;
        Profession = profession;
    }
    @Override
    public String toString(){
        return "name "+name+"age  "+age+"Hobbi  "+Hobbi+"Profession "+Profession;
    }
}

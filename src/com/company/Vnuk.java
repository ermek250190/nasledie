package com.company;

public class Vnuk extends Papa {
    String name;

    public Vnuk(String name, int age, String hobbi, String profession, String name1) {
        super(name, age, hobbi, profession);
        this.name = name1;
    }
    void vnuk(){
        System.out.println("       (.. garndson  every dey liking play in maincraft..)");
    }

    @Override
    public String toString(){
        return "{ VNUK }.."+".. name..  "+name+"..age.. "+age+"..hobbi.. "+Hobbi+"..profession .. "+Profession+"..name..  "+name;
    }
}

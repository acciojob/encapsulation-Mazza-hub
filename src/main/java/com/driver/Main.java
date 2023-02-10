package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly b1 = new RWOnly();
//        b1.name = "Ramesh";
//        System.out.println(b1.name);
//        name' has private access in 'com.driver.RWOnly'
        b1.setName("Ramesh Kumar Gill");
        System.out.print(b1.getName());
    }
}
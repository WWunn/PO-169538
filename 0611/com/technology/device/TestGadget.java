package com.technology.device;

public class TestGadget {
    public static void main(String[]args){
        Gadget testing = new Gadget("Huwawei", -5);
        System.out.println(testing.getModel()+testing.getPrice());
        testing.setmodel("Lenovo");
        testing.setprice(50);
        double a = testing.getPrice();
        String b = testing.getModel();
        System.out.println(a + b);
    }
}

package com.technology.device;

public class Gadget {
    private String model;
    private double price;
    public Gadget(String model, double price){
        this.model=model;
        if(price>=0) {
            this.price = price;
        }else this.price=99.99;
    }
    public void setprice(double price){
        if(price>=0)this.price=price;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public double getPrice(){

        return this.price;
    }
    public String getModel(){
        return this.model;
    }
}

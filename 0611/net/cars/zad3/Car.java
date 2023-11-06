package net.cars.zad3;

public class Car {
    private String brand;
    private String Model;
    private int productionYear;
    public Car(){
        this.brand="Xiaomi";
        this.Model="IO4";
        this.productionYear=2023;
    }
    public void addSmallData(String brand, String Model){
        this.brand = brand;
        this.Model = Model;
    }
    public void addBigData(String brand, String Model, int productionYear){
        this.brand = brand;
        this.Model = Model;
        this.productionYear = productionYear;
    }
}

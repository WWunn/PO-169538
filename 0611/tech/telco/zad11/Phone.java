package tech.telco.zad11;



public class Phone {
    private String manufacturer;
    private String model;
    public String operatingSystem="Android";
    public Phone(String manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
        this.operatingSystem="iOS";
    }
    public String getter(){
        return this.operatingSystem;
    }
}

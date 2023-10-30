public class Cars {
    public static void main(String[] args) {
        Car d2 = new Car();
        d2.speed = 100;
        d2.accelerate(100);
        d2.decelerate(69);
        System.out.println(d2.speed);
    }
}
class Car {
    String brand;
    String model;
    int speed;
    void accelerate(int value){
        speed = speed + value;
        System.out.println(speed);
    }
    void decelerate(int value){
        speed = speed - value;
        System.out.println(speed);
    }
}



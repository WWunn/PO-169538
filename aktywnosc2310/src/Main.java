import java.util.Scanner;
        public class Main {
            public static double milenakilometry(double mile) {
                double kilometry = mile / 0.621371;
                return kilometry;

            }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double mile=7;
        double kilometry=milenakilometry(mile);
        System.out.println(mile +"  =  " + kilometry);

    }
}
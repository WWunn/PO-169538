import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N;
        N = scan.nextInt();

        if(N%3==0){
            if(N%5==0) {
                System.out.println("FizzBuzz");}else{
                System.out.println("Fizz");

            };
            }else{if(N%5==0){
            System.out.println("Buzz");

        }else{
            for(int i = 1;i<=N;i++){
                System.out.println(i);

            }
        }

        }



    }



}
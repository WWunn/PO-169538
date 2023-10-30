public class Testbank {
    public static void main(String[] args) {
        Bank d3 = new Bank();
        d3.balance = 10241.23;
        d3.deposit(420);
        d3.withdraw(69);
    }

}
class Bank{
    double balance;
    void deposit(double value){
        balance = balance + value;
    }
    void withdraw(double value){
        balance = balance - value;
    }
}
public class BankAccount {
    public static void main(String[] args){
        double balance = 2175.37;

        balance -= 302.50;
        balance += 50.03;
        balance = (balance/2) + 20.00;
        balance -= 1;
        balance *= 2;
        balance += 1;

        System.out.println("This is the new balance Bob should have: " + balance);
    }
}

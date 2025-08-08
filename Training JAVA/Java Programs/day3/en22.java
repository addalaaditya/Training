package day3;

public class en22 {

    public static void main(String[] args) {

        en21 acc = new en21();
        acc.setBalance(1000);  

        System.out.println("Starting Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("After Deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("After Withdrawal: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}

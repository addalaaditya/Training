package day3;
//Bank Account: allow only secure deposit/withdrawal.
public class en21 {
    private int balance;

    public void setBalance(int amount) {
    	balance=amount;
            }

    public void deposit(int amount) {
        
            balance = balance + amount;
        
    }

    public void withdraw(int amount) {
       
            balance = balance - amount;
        
    }

    public int getBalance() {
        return balance;
    }
}

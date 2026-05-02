 public class BankAccount {
    double balance=1000;
    void deposit(double amount){
        balance+=amount;
        System.out.println("Balance: "+amount);
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Balance After Withdraw:"+amount);
    }
}



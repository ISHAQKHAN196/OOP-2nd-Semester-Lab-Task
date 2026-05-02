public class SavingAccount {
    void withdraw(double amount) {
        if (amount > 500) {
            System.out.println("Limit Exceeded!");
        }
        else {
            double balance = 0;
            balance=balance-amount;
            System.out.println("Saving Balance:"+balance);
        }
    }}

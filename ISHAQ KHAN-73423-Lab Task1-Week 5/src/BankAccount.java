public class BankAccount {
    int accountNumber;
    double balance;// ISHAQKHAN-73423
    Customer customer; // ISHAQKHAN-73423
    void deposit() {
        balance = balance + (double) 29999;
        System.out.println("Deposited: " + (double) 29999);// ISHAQKHAN-73423
    }
    void withdraw() {
        if ((double) 30000 <= balance) {// ISHAQKHAN-73423
            balance = balance - (double) 30000;
            System.out.println("Withdrawn: " + (double) 30000);// ISHAQKHAN-73423
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void displayAccount() {
        customer.displayCustomer();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

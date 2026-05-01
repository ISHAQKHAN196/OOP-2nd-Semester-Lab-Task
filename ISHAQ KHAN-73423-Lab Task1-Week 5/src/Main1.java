public class Main1 {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.name = "ISHAQ-KHAN";
        c1.customerId = 73423;// ISHAQKHAN-73423

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 76585;
        acc1.balance = 999999999;
        acc1.customer = c1;// ISHAQKHAN-73423

        acc1.displayAccount();
        acc1.deposit();
        acc1.withdraw();
        acc1.displayAccount();
    }
}
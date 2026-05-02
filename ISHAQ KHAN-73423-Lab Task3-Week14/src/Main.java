abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
    public static void main(String[]args){
        BankAccount e = new CurrentAccount();
        e.deposit();
        e.withdraw();
        System.out.println("-----------------------------------------------");
        BankAccount p=new SavingAccount();
        p.deposit();
        p.withdraw();
    }
}

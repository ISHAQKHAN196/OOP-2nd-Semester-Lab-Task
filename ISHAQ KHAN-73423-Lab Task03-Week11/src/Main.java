class Main {
  public static void main(String[] args){
    System.out.println("Testing Savings Account");
    SavingAccount s=new SavingAccount();
    s.withdraw(500);
    System.out.println("Testing Checking Account");
    CheckAccount c=new CheckAccount();
    c.withdraw(100);
  }
}

public class Driver{
  public static void main(String[] args){
    BankAccount a = new BankAccount(40.10,123,"hello");
    System.out.println(a);
    System.out.println(a.getBalance());
    System.out.println(a.getAccountID());
    a.setPassword("hi");
    a.deposit(1.10);
    System.out.println(a);
    a.deposit(-1);
    System.out.println(a);
    a.withdraw(30);
    System.out.println(a);
    a.withdraw(30);
    System.out.println(a);
  }
}

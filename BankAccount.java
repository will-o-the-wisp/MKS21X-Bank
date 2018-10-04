public class BankAccount{
  private double balance;
  private accountID int;
  private String password;
  public BankAccount(double balance, accountID int, String password){
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }
  public boolean deposit(double amount){
    if(amount > 0){
      balance += amount;
      return true;
    }
    else {
      return false;
    }
  }
  public boolean withdraw(double amount){
    if(amount > 0 && amount <= balance){
      balance -= amount;
      return true;
    }
    else {
      return false;
    }
  }
}
public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double balance, int accountID, String password){
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
    private boolean authenticate(String password){
      return password.equals(this.password);
    }

    public boolean transferTo(BankAccount other, double amount, String password){
      return authenticate(password) && this.withdraw(amount) && other.deposit(amount);
    }

}

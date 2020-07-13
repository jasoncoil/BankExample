public class BankAccount {
    private static int LAST_ACCOUNT_NUMBER = 1000;

    private Customer owner;
    private int accountNumber;
    private float accountBalance;

    //zero parameter constructor
    public BankAccount(){
        owner = null;
        accountNumber = ++LAST_ACCOUNT_NUMBER;
        accountBalance = 0;
    }

    //one parameter constructor
    public BankAccount(Customer c){
        owner = c;
        accountNumber = ++LAST_ACCOUNT_NUMBER;
        accountBalance = 0;
    }

    //get methods
    public Customer getOwner(){ return owner; }
    public int getAccountNumber(){ return accountNumber; }
    public float getAccountBalance(){ return accountBalance;}

    //toString method for the BankAccount
    public String toString(){
        return "Bank account #" + accountNumber + " balance is $" + String.format("%,1.2f",accountBalance);
    }

    //deposit and withdraw methods
    public void deposit(float amount){
        if(amount>0)
            accountBalance += amount;
    }
    public boolean withdraw(float amount){
        if(amount > accountBalance) {
            return false;
        }
        accountBalance -= amount;
        return true;
    }
}

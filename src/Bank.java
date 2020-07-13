public class Bank {
    private static final int ACCOUNT_CAPACITY = 100;

    private String name;
    private BankAccount[] accounts;
    private int numberOfAccounts;

    //constructor
    public Bank(String n){
        name = n;
        numberOfAccounts = 0;
        accounts = new BankAccount[ACCOUNT_CAPACITY];
    }

    //get methods
    public String getName(){ return name; }
    public BankAccount[] getAccounts(){ return accounts; }
    public int getNumberOfAccounts(){ return numberOfAccounts; }

    //returning a string representation for the bank
    public String toString(){
        return "Welcome to: " + name + "we currently have" + numberOfAccounts + "accounts.";
    }

    //add account to bank method
    private void addAccount(BankAccount b){
        if (numberOfAccounts < ACCOUNT_CAPACITY)
            accounts[numberOfAccounts++] = b;
    }
    //Open a bank account for the customer
    public void openAccount(Customer c){
        addAccount(new BankAccount(c));
    }

    //depositing and withdrawing for the bank account
    public boolean deposit(int accNum,float amount){
        for(int i=0;i<numberOfAccounts;i++){
            if(accounts[i].getAccountNumber()==accNum) {
                accounts[i].deposit(amount);
                return true;
            }
        }
        return false;
    }
    public boolean withdraw(int accNum,float amount){
        for(int i=0;i<numberOfAccounts;i++){
            if(accounts[i].getAccountNumber()==accNum){
                return accounts[i].withdraw(amount);
            }
        }
        return false;
    }

    //Method finding total of all balances
    public float totalOfAllBalances(){
        float answer = 0;
        for(int i=0;i<numberOfAccounts;i++){
            answer += accounts[i].getAccountBalance();
        }
        return answer;
    }
    //Method Listing all accounts
    public void listAccounts(){
        for(int i=0;i<numberOfAccounts;i++)
            System.out.println(accounts[i]);
    }

}

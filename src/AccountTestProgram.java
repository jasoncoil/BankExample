public class AccountTestProgram {
    public static void main(String[] args){
        //Creating a new bank!
        Bank myBank = new Bank("Jason's Bank");

        //Making bank accounts for customers
        myBank.openAccount(new Customer("Jessy","Winker",new Address("Foolers Drive","66"),"607-452-9403"));
        myBank.openAccount(new Customer("Gorgo","Thistle",new Address("Rally Lane","7"),"691-504-3091"));
        myBank.openAccount(new Customer("Felicia","Poridger",new Address("Calto Street","149"),"600-300-2091"));


        //depositing and withdrawing from new bank accounts to test the program
        myBank.deposit(1001,1000);
        myBank.deposit(1002,2050.68f);
        myBank.withdraw(1002, 1192.56f);
        myBank.withdraw(1003,25.23f);

        //Here are the Bank Accounts Listed
        System.out.println("\nHere are the bank accounts:");
        myBank.listAccounts();

        //Printing how much money is in the bank
        System.out.println("\nThe bank has this much money: $"
                + String.format("%,1.2f", myBank.totalOfAllBalances()));


    }
}

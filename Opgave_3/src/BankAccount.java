import java.util.ArrayList;

public class BankAccount {

    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startingBalance){
        this.owner = owner;
        this.balance = startingBalance;
        transactions = new ArrayList<>();
    }

    //Returns current balance
    public double getBalance(){
        return this.balance;
    }

    //Prints all transactions
    public void printTransactionHistory(){
        int transactionNumber = 1;
        for (Transaction t : transactions){
            //"just" 't' here prints the full desired result, since we specify toString() in this class itself.
            //Calls toString automatically
            System.out.println("Transaction " + transactionNumber + ": " + t);
            transactionNumber++;
            System.out.println();
        }
    }

    //Withdraw amount from balance if possible, and create new transaction "entry"
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("withdrawal", amount));
        }
        else {
            System.out.println("Not enough money");
        }

    }

    //Deposit amount to balance, and create new transaction "entry"
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction("deposit", amount));
    }

    //Returns the largest transaction made on this account
    public Transaction getLargetsTransaction(){
        Transaction largest = transactions.getFirst();
        for (Transaction t : transactions){
            if(t.amount > largest.amount){
                largest = t;
            }
        }
        return largest;
    }
}

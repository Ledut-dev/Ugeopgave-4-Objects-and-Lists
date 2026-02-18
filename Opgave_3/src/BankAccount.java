import java.util.ArrayList;

public class BankAccount {

    String owner;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner, double startingBalance){
        this.owner = owner;
        this.balance = startingBalance;
    }

    //Returns current balance
    public double getBalance(){
        return this.balance;
    }

    //Prints all transactions
    public void printTransactionHistory(){
        for (Transaction t : transactions){
            System.out.println(t.toString());
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

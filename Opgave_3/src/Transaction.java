public class Transaction {

    String type;
    double amount;

    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

    //Returns transaction as string, including type and amount
    public String toString(){
        return type + " transaction: " + amount + " kr";
    }


}

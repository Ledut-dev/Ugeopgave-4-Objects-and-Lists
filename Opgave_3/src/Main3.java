public class Main3 {


    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Lukas", 1000);

        account1.deposit(500);
        account1.withdraw(250);
        account1.deposit(10);
        account1.deposit(1651);
        account1.withdraw(50.5);

        account1.printTransactionHistory();

        System.out.println();
        System.out.println("Account balance: " + account1.getBalance() + " kr");

        System.out.println();
        System.out.println("Largest transaction: " + account1.getLargetsTransaction());

    }

}

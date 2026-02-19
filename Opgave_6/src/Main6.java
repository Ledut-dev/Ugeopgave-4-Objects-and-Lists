public class Main6 {

    public static void main(String[] args){

        Inventory player1 = new Inventory("Lukas", 5);
        Inventory player2 = new Inventory("Sakul", 2);

        player1.addItem(new Item("Sword", 50, "Weapon"));
        player2.addItem(new Item("Battleaxe", 150, "Weapon"));
        player1.addItem(new Item("Dagger", 10, "Weapon"));
        player2.addItem(new Item("Potion", 75, "Healing"));

        System.out.println("Player 1");
        player1.printInventory();

        System.out.println();

        System.out.println("Player 2");
        player2.printInventory();

        System.out.println("Total number of items created: ");
        System.out.println(Item.getTotalItemsCreated());

        System.out.println();

        System.out.println("Total value of player 1's items: ");
        System.out.println(player1.getTotalValue());
        System.out.println();

        System.out.println("Total value of player 2's items: ");
        System.out.println(player2.getTotalValue());
        System.out.println();

        System.out.println("Average value of created items: ");
        System.out.println(Item.getAverageItemValue());
    }
}

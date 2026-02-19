import java.util.ArrayList;

public class Inventory {

    private String playerName;
    private ArrayList<Item> items = new ArrayList<>();
    private int maxCapacity;


    public Inventory(String name, int maxCapacity){

        this.playerName = name;
        this.maxCapacity = maxCapacity;

    }

    public void addItem(Item item){

        if (items.size() < maxCapacity) {
            items.add(item);
        }
        else {
            System.out.println("Not enough inventory space");
        }
    }

    public int getTotalValue(){

        int totalValue = 0;

        for (Item i : items){
            totalValue += i.getValue();
        }

        return totalValue;
    }

    public ArrayList<Item> findItemsByType(String type){

        ArrayList<Item> itemsByType = new ArrayList<>();

        for (Item i : items){
            if (i.getType().equals(type)){
                itemsByType.add(i);
            }
        }

        return itemsByType;
    }

    public void printInventory(){
        System.out.println("Inventory: ");
        for (Item i : items){
            System.out.println(i.toString());
        }

    }

}

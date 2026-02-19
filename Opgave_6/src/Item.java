public class Item {

    private String name;
    private int value;
    private String type;

    private static int totalItemsCreated = 0;
    private static int totalItemValue = 0;


    public Item(String name, int value, String type){

        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated++;
        totalItemValue += value;

    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public String getType(){
        return this.type;
    }

    public static int getTotalItemsCreated(){
        return totalItemsCreated;
    }

    public String toString(){
        return "Name: " + this.name + " | Value: " + this.value + " | Type: " + this.type;
    }

    public static int getAverageItemValue(){
        return totalItemValue/totalItemsCreated;
    }

}

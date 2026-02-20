public class Product {

    String name;
    double price;
    String[] array;

    public Product(String name, double price, String[] array){

        this.name = name;
        this.price = price;
        this.array = array;

    }


    public void printInfo(){

        StringBuilder sb = new StringBuilder();

        for (String tag : array){
            sb.append(tag);
            sb.append(", ");
        }

        System.out.println("------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tags: " + sb.toString());
        System.out.println("------------------------------");
        System.out.println();
    }

//No need to create variable here, can return true directly in if condition, otherwise false
    public boolean hasTag(String tag){
        boolean hasTag = false;

        for (String t : array){
            if (tag.equals(t)){
                hasTag = true;
                break;
            }
        }
        return hasTag;
    }

}

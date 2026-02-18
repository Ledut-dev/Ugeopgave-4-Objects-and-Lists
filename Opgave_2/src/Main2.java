public class Main2 {


    public static void main(String[] args) {
        /*
        I know you can write the tags directly when creating the object, but this would make sense
        if you wanted to have different products with the same tags.
         */
        String[] electronicsSale = {"Sale", "Electronics", "Hardware", "Gaming"};
        String[] foodSale = {"Food", "Fruit", "Sale",};
        String[] food = {"Food", "Berry", "Seasonal"};
        String[] flashSale = {"Sale", "2 for 1", "Limited"};

        Product blackberry = new Product("Blackberry", 5, food);
        Product monitor = new Product("PC Monitor", 499, electronicsSale);
        Product shavingBlade = new Product("Shaving Blade", 150, flashSale);
        Product banana = new Product("Banana", 10, foodSale);


        Product[] products = {blackberry, monitor, shavingBlade, banana};

        //Print products on sale
        System.out.println("Products currently on sale: ");
        for (Product p : products) {
            if (p.hasTag("Sale")){
                p.printInfo();
            }

        }

        System.out.println();

        //Print most expensive product
        Product mostExpensive = products[0];
        System.out.println("Most expensive product: ");
        for (Product p : products){
            if (mostExpensive.price < p.price){
                mostExpensive = p;
            }
        }
        System.out.println(mostExpensive.name);

        printPriceRange(products, 5, 150);

    }


    //Print products within certain price range
    public static void printPriceRange(Product[] array, double min, double max){

        System.out.println("Products within the price of " + min + "-" + max);
        for (Product p : array){
            if (p.price >= min && p.price <= max){
                p.printInfo();
                System.out.println();
            }
        }

    }


}

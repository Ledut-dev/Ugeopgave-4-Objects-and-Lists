public class Main4 {

    public static void main(String[] args){

        Team red = new Team("Red");
        Team yellow = new Team("Yellow");

        red.addPlayer(new Player("Joey", 42));
        red.addPlayer(new Player("Bowie", 8));
        red.addPlayer(new Player("Doughy", 50));
        red.addPlayer(new Player("Rowy", 95));

        yellow.addPlayer(new Player("Molly", 50));
        yellow.addPlayer(new Player("Holly", 99));
        yellow.addPlayer(new Player("Dolly", 2));
        yellow.addPlayer(new Player("Polly", 63));

        System.out.println("Red team:");
        red.printTeam();
        System.out.println();

        System.out.println("Yellow team:");
        yellow.printTeam();
        System.out.println();

        System.out.println("Start fight!");
        red.compete(yellow);
        System.out.println();

        System.out.println("Best player on RED team: ");
        System.out.println(red.findBestPlayer().toString());
        System.out.println();

        System.out.println("Best player on YELLOW team: ");
        System.out.println(yellow.findBestPlayer().toString());
        System.out.println();

    }
}

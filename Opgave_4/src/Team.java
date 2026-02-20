import java.util.ArrayList;

public class Team {

    String teamName;
    ArrayList<Player> players;

    public Team(String name){
        this.teamName = name;
        this.players = new ArrayList<>();

    }

    public void addPlayer(Player p){
        players.add(p);
    }

    public int getAverageSkill(){
        int sum = 0;

        for (Player p : players){
            sum += p.skillLevel;
        }

        return sum/players.size();
    }

    public void printTeam(){
        for (Player p : players){
            System.out.println(p);
        }
    }

    public void compete(Team opponent){

        if (getAverageSkill() > opponent.getAverageSkill()){
            System.out.println(teamName + " wins!");
        }
        else if (getAverageSkill() < opponent.getAverageSkill()){
            System.out.println(opponent.teamName + " wins!");
        }
        else {
            System.out.println("It's a draw!");
        }
    }

    public Player findBestPlayer(){
        Player bestPlayer = players.getFirst();
        for (Player p : players){
            if (p.skillLevel > bestPlayer.skillLevel){
                bestPlayer = p;
            }
        }
        return bestPlayer;
    }
}

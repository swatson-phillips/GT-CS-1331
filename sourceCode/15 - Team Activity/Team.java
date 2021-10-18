import java.util.ArrayList;

/**
 *  Order: (2/5) Work on this class after you're done with <Player>, then move to <Defender>
 *
 * TO-DO in this Class:
 *     Finish constructor
 *     Finish findYoungest()
 *     Finish getDefenders()
 */
public class Team {

    private ArrayList<Player> players;
    protected static final int MAXPLAYERS = 11;

    public Team() {
        // instatiante the players field with an initial capacity of MAXPLAYERS
    }

    public void trainPlayers() {
        for (Player p : this.players) {
            //p.train();
        }
    }

    public void addPlayer(Player player) {
        if (players.size() < MAXPLAYERS) {
            this.players.add(player);
        } else {
            System.out.println("Can't add more than 11 players!");
        }
    }

    public Player findYoungest() {
        if (this.players.isEmpty()) {
            System.out.println("There are no players in the team");
            return null;
        }
        int min = 0;
        // Finish this method to compare players and find the youngest one. You MUST use compareTo()!
        return this.players.get(min);
    }

    public ArrayList<Player> getDefenders() {
        ArrayList<Player> defenders = new ArrayList<Player>();
        // Finish this method to return an ArrayList with just the defenders in the team
        // Hint: the instanceof keyword might be particularly helpful!
        return defenders;
    }

}

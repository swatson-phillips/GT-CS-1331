/**
 * Order: (3/5) Work on this class after you're done with <Player> and <Team>, then move to <Attacker>
 *
 * TO-DO in this class:
 *     Define <train> behavior
 *     Override <equals> from <Player>
 */
public class Defender extends Player {

    private boolean isGoalkeeper;

    public Defender(String name, int age, boolean isGoalkeeper) {
        super(name, age, "Defender");
        this.isGoalkeeper = isGoalkeeper;
    }

    // Define the <train> behavior of an Defender to print "<name> practiced headers!" if they're not
    // a goalkeeper, and to print "<name> practice saving shoots" if they're a goalkeeper

    // Add an equals method that builds on top of the Player equals method and makes an extra comparision
    // to see if the <isGoalkeeper> field of both defenders matches

    @Override
    public String toString() {
        if (this.isGoalkeeper) {
            return super.toString() + " and a Goalkeeper";
        } else {
            return super.toString() + " and not a Goalkeeper";
        }
    }

}

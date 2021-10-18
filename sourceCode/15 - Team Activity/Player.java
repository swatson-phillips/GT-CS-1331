/**
 *  Order: (1/5) Start on this class and then move to <Team>
 *
 * TO-DO in this class:
 *     Make <Player> comparable to other <Player>
 *     Implement <compareTo>
 *     Implement <train>
 *     Finish <equals>
 */
public abstract class Player {

    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // TO-DO: Implement the comparison logic between players
    // such that a younger player is "less" than an older player

    // TO-DO: Define a void no-args method called <train> but don't provide its implentation
    // We want the subclasses to provide the implementations

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Player) {
            Player other = (Player) obj;
            // TO-DO: Finish the equals method to compare every field in Player
            return this.name.equals(other.name)
                    && this.age == other.age
                    && this.position.equals(other.position);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()
                + this.age
                + this.position.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + name + ". Age: " + age + ". Position: " + position;
    }

    public String getName() {
        return this.name;
    }

}

// the abstract keyword makes the class abstract
public abstract class Animal {

    protected String species;

    // if we can't instantiate an Object why bother with a constructor?
    public Animal(String species) {
        this.species = species;
    }

    // We don't provide the implementation for abstract methods
    // We simply state their existance and leave it to the subclasses
    // to provide implementation
    public abstract void makeNoise(); // semicolon!

    // Are concrete methods allowed?
    public void scratch(int howLong) {
        for (int i = 0; i < howLong; i++) {
            System.out.println("this animal is scratching you");
        }
    }
}

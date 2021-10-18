public class Dog extends PetAnimal {
    protected int tailLength = 0;

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("woof woof");
    }

    public void bark() {
        System.out.println("Arf arf");
    }

    @Override
    public void move() {
        System.out.println("moving in the Dog class...");
    }

    @Override
    public void scratch(int howLong) {
        for (int i = 0; i < 2 * howLong; i++) {
            System.out.println("dog is scratching");
        }
    }

    @Override
    public String toString() {
        return "That's some dog!";
    }
}

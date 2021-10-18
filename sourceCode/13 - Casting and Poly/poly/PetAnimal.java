public class PetAnimal {
    public void makeNoise() {
        System.out.println("I'm an Animal");
    }

    public void move() {
        System.out.println("moving in the Animal class...");
    }

    public void scratch(int howLong) {
        for (int i = 0; i < howLong; i++) {
            System.out.println("scratching");
        }
    }
}

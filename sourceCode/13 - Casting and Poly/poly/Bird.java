public class Bird extends PetAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Tweet Tweet");
    }

    @Override
    public String toString() {
        return "fly birdy!";
    }
}

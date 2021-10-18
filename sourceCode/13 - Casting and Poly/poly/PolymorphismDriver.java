import java.util.Scanner;

public class PolymorphismDriver {
    public static void main(String[] args) {
        PetAnimal[] a = new PetAnimal[4];
        a[0] = new Bird();
        a[1] = new Fish();
        a[2] = new Dog();
        a[3] = new Cat();

        //iterate over the Animals and do stuff...
        // for(Animal myAnimal: a)
        for (int i = 0; i < a.length; i++) {
            PetAnimal myAnimal = a[i];
            //all animals have these methods
            myAnimal.makeNoise();
            myAnimal.move();
            myAnimal.scratch(i);

            // this only checks the object, does not cast it
            if (myAnimal instanceof Dog) {
                Dog d = (Dog) myAnimal;
                d.bark(); //but if it is a Dog we can make it bark
            }


            //compile? runtime?
            if (i == 2) {
                ((Dog) a[i]).bark();
            }

            //compile? runtime?
            if (i == 1) {
                // what kind of object is stored in a[i]? Is it a Dog?
                Dog myDog = ((Dog) a[i]);
                myDog.bark();
            }
        }

        //Now, lets let the user pick the Animal we create...
        PetAnimal a2;
        System.out.println("enter a number: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i == 0) {
            a2 = new Fish();
        } else if (i == 1) {
            a2 = new Dog();
            //can we call a2.bark() since it is a Dog?
        } else if (i == 2) {
            a2 = new Cat();
        } else {
            a2 = new Bird();
        }
        // we can still call makeNoise, what noise is made?
        a2.makeNoise();
    }
}

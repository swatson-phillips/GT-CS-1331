public class MutualBank implements Bank, American {
    @Override
    public void deposit(double deposit) {

    }

    @Override
    public double withdraw(double withdraw) {
        return 0;
    }

    @Override
    public void audit() {
        System.out.println("MutualBank.audit");
    }


    /*
    @Override
    public void speak() {
        American.super.speak();
        System.out.println("Hi");
    }
    */


}

public interface Bank {
    final static int FEET_PER_MILE = 5280;

    void deposit(double deposit);
    double withdraw(double withdraw);
    void audit();

    // default methods?
    //what is this method took in a String, how does this change MutualBank
    default void speak() {
        System.out.println("what does this even mean?");
    }

    static boolean isNull(String str) {
        return str == null ? true : false;
    }
}

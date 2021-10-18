public class InterfaceExample {
    public static void main(String[] args) {
        Bank[] allTheBanks = new Bank[3];
        allTheBanks[0] = new MutualBank();
        allTheBanks[1] = new RegionalBank();
        allTheBanks[2] = new SpecificMutualBank();

        for(int i=0; i <allTheBanks.length; i++) {
            Bank b = allTheBanks[i];
            System.out.println("----------a[" + i + "].getClass() == "
                    + b.getClass().toString() + "----------");

            b.speak();
            b.deposit(1000.0);
            if (b instanceof MutualBank) {
                b.audit();
            }
        }
        System.out.println(Bank.isNull(null));

        int miles = 10;
        System.out.println(Bank.FEET_PER_MILE * miles);

        SomeInterface someInterface = new BankAndSomeInterface();

    }
}

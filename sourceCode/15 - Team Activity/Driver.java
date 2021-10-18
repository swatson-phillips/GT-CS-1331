/**
 * Order: (5/5) After you're done with <Team> <Player> <Defender> <Attacker> use this class to test your code
 */
public class Driver {

    public static void main(String[] args) {
        Player martinez = new Attacker("Martinez", 26);
        Player barco = new Attacker("Barco", 20);
        Player escobar = new Defender("Escobar", 25, false);
        Player guzan = new Defender("Guzan", 35, true);

        Team atlantaUnited = new Team();

        atlantaUnited.addPlayer(martinez);
        atlantaUnited.addPlayer(barco);
        atlantaUnited.addPlayer(escobar);
        atlantaUnited.addPlayer(guzan);

        atlantaUnited.trainPlayers();

        System.out.println("Youngest player - " + atlantaUnited.findYoungest());

        System.out.println("Defenders: - " + atlantaUnited.getDefenders());

    }

}

package strategy;

/**
 * Created by sakhtar on 18/03/14.
 */
public class Main {
    public static void main(String[] args) {
        Character character = new Knight();
        character.setWeaponBehaviour(new KnifeBehaviour());

        character.fight();
        character.setWeaponBehaviour(new SwordBehaviour());
        character.fight();
    }
}

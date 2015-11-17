package strategy;

/**
 * Created by sakhtar on 18/03/14.
 */
public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("slash using knife");
    }
}

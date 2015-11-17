package strategy;

/**
 * Created by sakhtar on 18/03/14.
 */
public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public abstract void talk();

    public void fight(){
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}

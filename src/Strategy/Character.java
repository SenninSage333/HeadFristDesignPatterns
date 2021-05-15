package Strategy;

public abstract class Character {
    WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void fight();

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}

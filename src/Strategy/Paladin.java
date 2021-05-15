package Strategy;

public class Paladin extends Character {

    public Paladin(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    void fight() {
        this.weapon.use();
    }
}

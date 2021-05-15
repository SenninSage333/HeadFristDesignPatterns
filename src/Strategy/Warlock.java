package Strategy;

public class Warlock extends Character {

    public Warlock(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    void fight() {
        this.weapon.use();
    }
}

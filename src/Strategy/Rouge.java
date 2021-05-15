package Strategy;

public class Rouge extends Character {

    public Rouge(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    void fight() {
        this.weapon.use();
    }
}

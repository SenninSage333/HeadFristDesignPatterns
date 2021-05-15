package Strategy;

public class Barbarian extends Character {

    public Barbarian(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    void fight() {
        this.weapon.use();
    }
}

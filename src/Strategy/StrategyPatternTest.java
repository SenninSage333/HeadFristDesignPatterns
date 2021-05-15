package Strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Paladin paladin = new Paladin(new LongSwordBehavior());
        paladin.fight();
        paladin.setWeapon(new AxeBehavior());
        paladin.fight();

        Rouge rouge = new Rouge(new KnifeBehavior());
        rouge.fight();
    }
}

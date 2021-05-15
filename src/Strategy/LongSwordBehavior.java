package Strategy;

public class LongSwordBehavior implements WeaponBehavior {

    @Override
    public void use() {
        System.out.println("Fighting with long sword!");
    }
}

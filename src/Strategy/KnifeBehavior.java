package Strategy;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void use() {
        System.out.println("Fighting with knife!");
    }
}

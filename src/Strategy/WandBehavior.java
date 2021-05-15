package Strategy;

public class WandBehavior implements WeaponBehavior {

    @Override
    public void use() {
        System.out.println("Fighting with wand!");
    }
}

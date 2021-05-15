package Strategy;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void use() {
        System.out.println("Fighting with axe!");
    }
}

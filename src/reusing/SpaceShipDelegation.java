package reusing;

/**
 * @author ning
 * function: 使用代理
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    //  Delegated methods
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void forward (int velocity) {
        controls.forward(velocity);
    }

    //  ...

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation ("NSEA Protector");
        protector.forward(100);
    }
}

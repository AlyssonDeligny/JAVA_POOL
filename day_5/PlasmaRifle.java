public class PlasmaRifle extends Weapon{
    public PlasmaRifle() {
        super("Plasma Rifle", 5, 21, false);
    }

    protected String output = "PIOU";

    @Override
    public void attack() {
        System.out.println(output);
    }
}
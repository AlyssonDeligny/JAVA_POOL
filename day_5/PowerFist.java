public class PowerFist extends Weapon{
    public PowerFist() {
        super("Power Fist", 8, 50, true);
    }

    protected String output = "SBAM";

    @Override
    public void attack() {
        System.out.println(output);
    }
}
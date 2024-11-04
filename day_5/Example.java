public class Example {
    public static void main(String[] args) {
         PlasmaRifle plasma= new PlasmaRifle();
         PowerFist powerFist = new PowerFist();
        System.out.println("This weapon is named '"+ plasma.getName() +"' is has an apcost of "+ plasma.getApcost() +", deals "+ plasma.getDamage() +" damages and "+(plasma.isMelee() ?"is":"is not")+" a melee weapon.");
        System.out.println("This weapon is named '"+ powerFist.getName() +"' is has an apcost of "+ powerFist.getApcost() +", deals "+ powerFist.getDamage() +" damages and "+(powerFist.isMelee() ?"is":"is not")+" a melee weapon.");
        powerFist.attack();
        plasma.attack();
    }
}



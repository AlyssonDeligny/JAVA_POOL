public class Example {
    public static void main(String[] args) {

        // // test exo 1
        // Character perso = new TestCharacter("Jean-Luc");
        // System.out.println(perso.getName());
        // System.out.println(perso.getLife());
        // System.out.println(perso.getAgility());
        // System.out.println(perso.getStrength());
        // System.out.println(perso.getWit());
        // System.out.println(perso.getRPGClass());
        // perso.attack("my weapon");

        // // test exo 2
        // Character warrior = new Warrior("Jean-Luc");
        // Character mage = new Mage("Robert");
        // warrior.attack("hammer");
        // mage.attack("magic");

        // //test exo 3
        // mage.moveBack();
        // mage.moveLeft();
        // warrior.moveRight();
        // warrior.moveForward();

        // test exo 4
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");

        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();

        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();

        //test exo 5
        mage.unsheathe();
        warrior.unsheathe();
    }
}

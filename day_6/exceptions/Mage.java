public class Mage extends Character {
    private String name;

    public Mage(String name) {
        super(name, "Mage");
        this.name = name;
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }


    @Override
    public void attack(String weapon) {
        if (weapon.isEmpty()|| weapon==null){
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        }else if(!weapon.equals("wand")&& !(weapon.equals("magic"))){
            throw new WeaponException(this.name + ": A " + weapon + "?? What should I do with this?!");
        }else{
            super.attack(weapon);
            System.out.println(name + ": Feel the power of my " + weapon + "!");
        }
    
    }
    
    
    @Override
    public void moveRight() {
        System.out.println(name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back furtively.");
    }
    
    @Override
    public void tryToAttack(String weapon){
        try{
            attack(weapon);
        } catch(WeaponException e ) {
            System.out.println(e.getMessage());
        }
    }
}

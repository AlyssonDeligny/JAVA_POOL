public abstract class Character implements Movable{
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

    public String getName(){
        return this.name;
    }
    
    public int getLife() {
        return this.life;
    }
    
    public int getAgility() {
        return this.agility;
    }
    
    public int getStrength() {
        return this.strength;
    }
    
    public int getWit() {
        return this.wit;
    }
    
    public String getRPGClass() {
        return this.RPGClass;
    }

    public Character(String name) {
        this.RPGClass = "";
        this.name = name;
    }

    public Character(String name,String RPGClass){
        this.name =name;
        this.RPGClass = RPGClass;
    }

    public void attack(String args){
        System.out.println(name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight(){
        System.out.println(name + ": moves right");
    }
    @Override
    public void moveLeft(){
        System.out.println(name + ": moves left");
    }
    
    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward");
    }
    
    @Override
    public void moveBack() {
        System.out.println(name + ": moves back");
    }

    public final void unsheathe(){
        System.out.println(name + ": unsheathes his weapon.");

    }



}
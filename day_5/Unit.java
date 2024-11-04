public abstract class Unit implements Fighter{
    String name;
    int hp;
    int ap;
    Fighter closeTarget;

    protected Unit(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getHp() {
        return this.hp;
    }
    @Override
    public int getAp() {
        return this.ap;
    }
    public Fighter getCloseTarget() {
        return this.closeTarget;
    }
    @Override
    public void receiveDamage(int damage) {
        this.hp -= damage;
    }

    @Override
    public boolean moveCloseTo(Fighter target) {
        return false;
    }


    
    @Override
    public void recoverAP() {
    
    }
}

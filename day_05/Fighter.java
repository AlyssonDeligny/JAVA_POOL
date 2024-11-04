public interface Fighter {
    public abstract boolean equip(Weapon weapon);
    public abstract boolean attack(Fighter fighter);
    public abstract void receiveDamage(int damage);
    public abstract boolean moveCloseTo(Fighter fighter);
    public abstract  void recoverAP();
    public abstract String getName();
    public abstract int getAp();
    public abstract int getHp();
}

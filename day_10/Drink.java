public abstract class Drink implements Food{
    
    float price;
    int calories;
    boolean aCan = false;


public Drink(float price, int calories){
        this.price = price;
        this.calories = calories;
    }

    public Drink(){

    }

    public boolean isACan(){
        return this.aCan;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}

public abstract class Dessert implements Food{

    float price;
    int calories;

public Dessert(float price, int calories){
        this.price = price;
        this.calories = calories;
    }

    public Dessert(){

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

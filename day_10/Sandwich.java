import java.util.Arrays;
public abstract class Sandwich implements Food{
    
    float price;
    int calories;
    boolean vegetarian = false;
    String[] ingredients;

    public Sandwich(float price, int calories){
        this.price = price;
        this.calories = calories;
    }
    public Sandwich(){

    }

    public boolean isVegetarian(){
        return this.vegetarian;
    }

    public String getIngredients(){
        return Arrays.toString(this.ingredients);
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

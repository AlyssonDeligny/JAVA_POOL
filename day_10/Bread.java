public abstract class Bread implements Food {
    
    float price;
    int calories;
    int bakingTime = 0;

    public Bread(float price,int calories){
        this.price = price;
        this.calories = calories;
    }
    
    public Bread() {
       
    }

    @Override
    public float getPrice(){
        return this.price;
    }
    @Override
    public int getCalories(){
        return this.calories;
    }
    public int getBakingTime(){
        return this.bakingTime;
    }
}

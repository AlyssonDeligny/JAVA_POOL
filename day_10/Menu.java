public abstract class Menu < D,M extends Food >{

    D drink;
    M meal;

    public D getDrink(){
        return this.drink;
    }

    public M getMeal(){
        return this.meal;
    }

    @Override
    public float getPrice(){
        float result = (drink.getPrice() + meal.getPrice())*0.9f;
        return result;
    }
}

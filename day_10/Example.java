import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Food bread = new SoftBread();
        System.out.println("The sofbread costs " + bread.getPrice() + " euros and contains " + bread.getCalories() + " calories.");
        Food cheesecake = new CheeseCake();
        System.out.println("The cheecake costs " + cheesecake.getPrice() + " euros and contains " + cheesecake.getCalories() + " calories.");
        Sandwich  panini = new Panini();
        System.out.println(panini.getPrice());
        System.out.println(panini.getCalories());
        System.out.println(panini.getIngredients());
        System.out.println(panini.isVegetarian());
        

    }
}

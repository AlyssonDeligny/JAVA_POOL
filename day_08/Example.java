import Factory.*;

public class Example {

    public static void main(String[] args) {
        Factory factory = new Factory();
        try {
            Toy toy = factory.create("gameboy");
            System.out.println(toy.getTitle());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }

}

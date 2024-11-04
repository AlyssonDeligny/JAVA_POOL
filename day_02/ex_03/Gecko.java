public class Gecko {
    private final String name;
    public Gecko() {
        System.out.println("Hello!");
        this.name="Unknown";
    }
    public Gecko(String name){
        System.out.println("Hello" + " " + name + "!");
        this.name =name;
    }
     String getName(){
        return this.name;
    }
}

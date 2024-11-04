public class Gecko {
    private final String name;
    private int age;

    public Gecko() {
        System.out.println("Hello!");
        this.name="Unknown";
    }
    public Gecko(String name,int age){
        this.age = age;
        this.name =name;
        System.out.println("Hello" + " " + name + "!");
    }
    public Gecko(String name){
        this.name = name;
        System.out.println("Hello" + " " + name + "!");
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int newAge){
        this.age = newAge;
    }
    void status(){
        switch(this.age){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1,2:
                System.out.println("Baby Gecko");
                break;
            case 3,4,5,6,7,8,9,10:
                System.out.println("Adult Gecko");
                break;
            case 11,12,13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
        }
    }

}

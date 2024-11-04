import chocolate.*;
import planet.*;

public class Astronaut {
    String name;
    int snacks = 0;
    String destination = null;
    int id;
    static int counter =0;

    public Astronaut(String name){
        this.name =name;
        this.id = counter++;
        System.out.println(name + " ready for launch!");
    }
    public String getName() {
        return this.name;
    }
    public int getSnacks() {
        return this.snacks;
    }
    public String getDestination() {
        return this.destination;
    }
    public int getId() {
        return this.id;
    }
    public void doActions(){
        System.out.println(this.name + ": Nothing to do.");
        if (this.destination ==null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }
    public void doActions(planet.Mars mars){
        System.out.println(this.name + ": Started a mission!");
        this.destination = mars.getLandingSite();
    }
    public void doActions(chocolate.Mars mars){
        System.out.println(this.name + ": Thanks for this Mars number " + mars.getId());
        this.snacks= this.snacks +1;
        if (this.destination ==null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }


}

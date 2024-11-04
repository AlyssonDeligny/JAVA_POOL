public class Mars {
     private int id = 0;
     static int counter = 0;

    public Mars(){
        this.id = counter++;
    }

     public int getId(){
        return this.id;
    };

}

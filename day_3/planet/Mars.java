package planet;

public class Mars {
    private int id = 0;
    static int counter = 0;
    String landingSite;

    public int getId(){
        return this.id;
    };

    public String getLandingSite(){
        return this.landingSite;
    }

    public Mars(String landingSite){
         this.landingSite = landingSite;
    }
}

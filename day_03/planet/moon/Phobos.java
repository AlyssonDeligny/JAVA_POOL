package planet.moon;

import planet.Mars;

public class Phobos {
    private Mars mars;
    private String landingSite;

    public Mars getMars() {
        return this.mars;
    }
    public String getLandingSite() {
        return this.landingSite;
    }

    public Phobos(Mars planet,String landingSite){
        this.landingSite= landingSite;
        this.mars = planet;
        System.out.println("Phobos placed in orbit.");
    }
    public Phobos(String landingSite){
        this.landingSite= landingSite;
        System.out.println("No planet given.");
    }
}


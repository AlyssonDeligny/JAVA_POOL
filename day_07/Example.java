import java.util.List;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // Solo<String> strSolo = new Solo<>("toto");
        // String strValue = strSolo.getValue();
        // System.out.println(strValue);
        // strSolo.setValue("tata");
        // System.out.println(strSolo.getValue());

        // Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
        // Integer intValue = intSolo.getValue();
        // System.out.println(intValue);
        // intSolo.setValue(Integer.valueOf(1337));
        // System.out.println(intSolo.getValue());

        // Duet duet = new Duet();
        // System.out.println(duet.max("tototot", "toto"));

        // Duet duet2 = new Duet();
        // System.out.println(duet2.max(45, 76));

        List<Mage> mages = new ArrayList<>();
        mages.add(new Mage("Merlin"));
        mages.add(new Mage("Mandrake"));
        List<Warrior> warriors = new ArrayList<>();
        warriors.add(new Warrior("Spartacus"));
        warriors.add(new Warrior("Clovis"));
        Battalion battalion =new Battalion();
        battalion.add(mages);
        battalion.add(warriors);
        battalion.display();

    }
}

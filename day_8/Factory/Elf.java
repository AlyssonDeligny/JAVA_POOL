package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {

    private Toy toy;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory){
        this.factory = factory;
        this.papers = new ArrayList<>();
    }

    public boolean pickToy(String toy){
        try {
            if(this.toy==null){
                this.toy = this.factory.create(toy);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
            }else{
                System.out.println("Minute please?! I'm not that fast.");
                return false;
            }
            
        } catch (Exception e) {
             System.out.println("I didn't find any " + this.toy.getTitle());
             return false;
        }
    }

    public boolean pickPapers(int nb){
        this.papers.addAll(this.factory.getPapers(nb));
        return true;
    }

    public GiftPaper pack(){
        if(this.papers.isEmpty()){
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        else if(this.toy==null){
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return this.papers.removeFirst();
        }else{
            System.out.println("And another kid will be happy!");
            this.toy = null;
            return this.papers.removeFirst();
        }
    }

}

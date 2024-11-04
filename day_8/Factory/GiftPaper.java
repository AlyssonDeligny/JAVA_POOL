package Factory;

public class GiftPaper {

     Toy gift;

    public void wrap(Toy gift){
        this.gift = gift;
        
    }

    public Toy unwrap(){
        Toy newGift = this.gift;
        this.gift = null;
        return newGift;
    }
    
}

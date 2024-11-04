import java.util.List;
import java.util.ArrayList;

public class Battalion {
    public List<Character> characters = new ArrayList<>();

    public <T extends Character> void add(List<T> characters){
        this.characters.addAll(characters);
    }
    public void display(){
        for(Character character : characters){
            System.out.println(character.getName());
        }
        
    }
}

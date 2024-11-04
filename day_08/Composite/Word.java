package Composite;

public class Word implements Sentence{
    protected String word;

    public Word(String word){
      this.word =word;
    }

    @Override
    public void print() {
        System.out.println(word);
    }
}

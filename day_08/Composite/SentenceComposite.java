package Composite;

import java.util.List;

public class SentenceComposite implements Sentence{

    List<Sentence> childSentence;

    @Override
    public void print() {
        for(Sentence sentence : childSentence){
            sentence.print();
        }
    }

    public void add(Sentence sentence){

    }

    public void remove(Sentence sentence){

    }
}

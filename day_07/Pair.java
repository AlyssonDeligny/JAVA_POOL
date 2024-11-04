public class Pair <T,V> {
    T first;
    V second;

    public void display(T first,V second){
        System.out.println("first: " + first + ", second: " + second);
    }

    public T getFirst() {
        return this.first;
    }
    
    public V getSecond() {
        return this.second;
    }

    public Pair(T first, V second){
        this.first=first;
        this.second = second;
    }
}

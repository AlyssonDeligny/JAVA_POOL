public class Solo <T> {
    T value;

    public Solo(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T newValue){
        this.value = newValue;
    }
}
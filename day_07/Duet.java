public class Duet {

    public static <T extends Comparable <T>> T min (T param1, T param2) {
        if (param1.compareTo(param2)>=0){
            return param2;
        }else{
            return param1;
        }
    }

    public static <T extends Comparable <T>> T max(T param1, T param2) {
        if (param1.compareTo(param2) >= 0) {
            return param1;
        } else {
            return param2;
        }
    }
}

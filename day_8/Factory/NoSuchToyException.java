package Factory;

import java.lang.Exception;

public class NoSuchToyException extends Exception {

    static final long serialVersionUID = 1L;

    public NoSuchToyException(String message){
       super(message);
   }
}

import java.io.*;
import java.util.*;

public class serial implements Serializable{
    public String name;
    public String message;

    serial(String n){
        message = "";
        name = n;
    }

    public String getName(){
        return name;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String inMessage){
        message = inMessage;
    }
}

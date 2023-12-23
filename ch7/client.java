
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try{
            String message = "";
            String name = "";
            System.out.print("Please enter name:");
            name = getString();

            serial myMessage = new serial(name);
            System.out.print("message: ");
            message = getString();
            myMessage.setMessage(message);
            System.out.print(myMessage.getMessage());
            System.out.print(myMessage.getName());
            Socket socToSer = new Socket("127.0.0.1", 11111);
            ObjectOutputStream myOpStream = new ObjectOutputStream(socToSer.getOutputStream());

            myOpStream.writeObject(myMessage);
            myOpStream.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static String getString() throws Exception{
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in), 1);
        String s1 = stdin.readLine();
        return (s1);
    
    }
}

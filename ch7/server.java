// package 物件導向程式設計.OOP_practice.ch7;
import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) {
        serial myServerSerial = null;
        try {
            ServerSocket myServerSocket = new ServerSocket(11111);
            System.out.println("Ready\n");
            Socket incoming = myServerSocket.accept();
            ObjectInputStream myInputStream = new ObjectInputStream(incoming.getInputStream());
            myServerSerial = (serial)myInputStream.readObject();
            System.out.println(myServerSerial.getName() + ":" + myServerSerial.getMessage() + "\n");
            myInputStream.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

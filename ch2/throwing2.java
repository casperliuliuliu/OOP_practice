package 物件導向程式設計.OOP_practice.ch2;
class Base extends Exception{}
class Derived extends Base{}
public class throwing2 {
    public static void main(String args[]){
        try {throw new Derived();}
        catch(Base b){
            System.out.println("E1");
        }
        // catch( Derived d){
        //     System.out.println("E2");
        // }
    }
}

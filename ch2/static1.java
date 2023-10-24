package 物件導向程式設計.OOP_practice.ch2;
class MyClass {
    static int staticVar = 10;

    public void printStaticVar() {
        System.out.println("Static variable: " + staticVar);
    }
}
public class static1 {
    public static void main(String args[]){
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.staticVar = 20; // Modifying staticVar through obj1

        System.out.println(obj1.staticVar); // This will print 20
        System.out.println(obj2.staticVar); // This will also print 20
        System.out.println(MyClass.staticVar); // This will also print 20
    }

}


package 物件導向程式設計.OOP_practice.ch5;

// public class Test{
// public int count(int i){
// return 0;
// }
// }
// class TestChild extends Test{
// public int count(long i) throws Exception{
// return 0;
// }
// }
// interface Test {
// abstract public void someMethod() throws Exception;
// }
// public class Test{
// public int count(int i){
// return 0;
// }
// public int count(int j){
// return 1;
// }
// }

// class One{
// public void count(int i){
// System.out.println(0);
// }
// }
// public class Test extends One{
// public void count(int j){
// System.out.println(1);
// }
// public static void main(String[] args) {
// One one = new Test();
// one.count(0);
// }
// }

// public class Test{
// public static void main(String[] args){
// One o = new One();
// o.sayHello();
// }
// }
// class One{
// public final void sayHello(){
// System.out.println("Hello");
// }
// public void sayHi();
// }

// public class Test {

//      /**
//       * InnerTest
//       */
//      public class InnerTest {
//         void Hello(){
//             System.out.println("cool");
//         }
        
//      }
//      public static void main(String[] args) {
//         InnerTest inner = Test().new InnerTest();
//         inner.Hello();
//      }
// }

public class Test {

    /**
     * InnerTest
     */
    public class InnerTest {
        void Hello() {
            System.out.println("cool");
        }
    }

    public static void main(String[] args) {
        // Test test = new Test(); // Create an instance of the outer class
        InnerTest inner = new Test().new InnerTest(); // Create an instance of the inner class
        inner.Hello();
    }
}
class Main{
 public static void main(String args[]){
  try{ throw 20;}
  catch (int e){
   System.out.println("Received Exception" + e);
  }
}}
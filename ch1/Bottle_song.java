public class Bottle_song {
    public static void main(String[] args){
        System.out.println("hello");
        String word = "bottles";
        int num = 10;
        while (num>0){
            if (num == 1)
                word = "bottle";
            System.out.println(num + " " + word + " left");
            num --;
            if (num == 0){
                System.out.println("there's no bottle left");
            }
        }
    }
}
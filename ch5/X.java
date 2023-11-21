package 物件導向程式設計.OOP_practice.ch5;

class X {
    int x;
    X (int y){
    y=2;
    x=99;
    }
}

class Y extends X {
        Y () {super(4);}

        void displayX() {
        System.out.print(x);
        }
        public static void main(String args[]){
        new Y().displayX();
        }
}


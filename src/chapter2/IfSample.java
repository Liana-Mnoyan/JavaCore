package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y){
            System.out.println("x is less y");
            x=x*2;
            if(x==y)
                System.out.println("x is equals y");
            x=x*2;
            if( x > y)
                System.out.println("x is more y");

        }
    }
}
package chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Absolute volue ");
        System.out.println(i + "==" + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Absolit volue ");
        System.out.println(i + " =="+ k);
    }
}

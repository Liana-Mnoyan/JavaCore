package homework1;

public class FigurePainter4 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
        }
        System.out.println();
        System.out.println();
//

    }

}



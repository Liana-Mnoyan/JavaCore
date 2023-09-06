package homework1;

public class FigurePainter3 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 3; y >= x; y--)
                System.out.print(" ");

            for (int z = 0; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}











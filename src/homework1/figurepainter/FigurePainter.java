package homework1.figurepainter;

public class FigurePainter {

    void figureOne() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    void figureTwo() {
        for (int x = 0; x < 5; x++) {
            for (int y = 4; y >= x; y--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void figureThree() {
        for (int x = 0; x < 5; x++) {
            for (int y = 3; y >= x; y--)
                System.out.print(" ");

            for (int z = 0; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFour() {
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
    }



}







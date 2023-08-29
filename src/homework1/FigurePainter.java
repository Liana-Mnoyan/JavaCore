package homework1;

public class FigurePainter {
    //first Example
    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {

                System.out.print("*");
            }
            System.out.println();


        }

    }
}


//second Example
public class FigurePainter1 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y >= x; y--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}




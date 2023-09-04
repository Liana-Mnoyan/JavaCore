package homework2;

public class ForExample {

    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//           System.out.print("-" + (i + 1));
//        }
        int count = 1000;
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + 1);
            if (i != count - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
        //            for ( i = 1; i <= 100; i++) {
//                if (i % 2 == 0) {
//                    System.out.print(" " + i);
//                }
//            }
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int []array = { 2,5,4,6,8,2,1,9,8};
        int max = array [0];
        for (int i = 1 ;i <array.length;i++){
            if (array [i]>max ){
                max= array[i];
            }

        }
        System.out.println("max:"+max);
    }

}







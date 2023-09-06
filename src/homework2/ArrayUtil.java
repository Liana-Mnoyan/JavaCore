package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (" "));

        }
        System.out.println();

        System.out.println(numbers[0]);
        System.out.println();
        int lastIndex = numbers.length - 1;
        System.out.println(numbers[lastIndex]);

        System.out.println();
        System.out.println(numbers.length);


        System.out.println();

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= min)
                min = numbers[i];

        }
        System.out.print("min" + min);
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + (" "));
            }

        }
        System.out.println();
//       for (int i = 0; i <= numbers.length; i++) {
//            if (numbers[i] % 2 == 1) {
//                System.out.print(i + (" "));
//
//         }
//        }
                int sum = 0;
                for (int  i = 0; i < numbers.length; i++)
                    sum = sum + numbers[i];
                System.out.println(sum);

                System.out.println();
                System.out.println("Avarage is" + (" ") + sum / numbers.length);

                System.out.println();
                System.out.println();
            }
        }





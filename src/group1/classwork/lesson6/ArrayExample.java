package group1.classwork.lesson6;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = new int[1000];

        for (int i = 0; i < 1000; i++) {
            int x = i + 1;
            numbers[i] = x;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        int[] numbers = {90, 4, -34, 56, -78, 9, 6, 43, 3, 89, 8};
//        for (int i = numbers.length -1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//        int i = numbers.length - 1;
//        System.out.println(numbers[i]);

    }

}

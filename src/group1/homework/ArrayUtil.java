package group1.homework;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {34, 22, 56, 7, 9, 1, 34, 0, 2, -6, 90};

        //Տպել բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Տպել ամենամեծ թիվը
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("max = " + max);


        //Տպել ամենափոքր թիվը
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("զույգերը:");
        //տպել բոլոր զույգերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("կենտերը:");
        //տպել բոլոր կենտերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //տպել զույգերի քանակը
        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println("զույգերի քանակը -» " + countOfEvens);

        //տպել կենտերի քանակը
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        System.out.println("կենտերի քանակը -» " + countOfOdds);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum -> " + sum);
        double avg = sum / array.length;
        System.out.println(avg);
    }
}

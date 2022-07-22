package homework.arrayutil;

public class ArrayExamples {


    public static void main(String[] args) {

        int[] array = {56, 8, 3, -8, 0, 65, 6, 54, 2, 13};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max-> " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min-> " + min);

        System.out.println("տպել բոլոր զույգերը");

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("տպել բոլոր կենտերը");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println("զույգերի քանակը -> " + countOfEvens);

        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        System.out.println("կենտերի քանակը -> " + countOfOdds);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("էլեմենտների գումարը -» " + sum);
        double avg = sum / array.length;
        System.out.println("միջին թվաբանականը -» " + avg);

    }

}

package group1.homework;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {50, 43, 6, 7, 1, 2, 9, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }

    }

}

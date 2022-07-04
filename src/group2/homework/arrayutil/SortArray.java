package group2.homework.arrayutil;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {30, 7, 1, 8, 51, 23, 5, 8, 9};


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

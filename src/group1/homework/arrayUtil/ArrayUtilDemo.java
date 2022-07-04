package group1.homework.arrayUtil;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {3, 6, 4, 98, 1, 4};
        au.print(array);
        au.sortFromMin(array);
        System.out.println();
        au.print(array);

    }

}

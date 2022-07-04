package group1.homework.practiceHomework;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();

        long convert = practiceHomework.convert(1000000000);
        System.out.println(convert);

        System.out.println(practiceHomework.calcAge(4));

        System.out.println(practiceHomework.nextNumber(5));

        System.out.println(practiceHomework.reverseBoolean(false));

        int[] array1 = {3, 4, 5, 6, 4, 5, 6, 7};
        int[] array2 = {7, 8, 9, 0, 4, 3};
        System.out.println(practiceHomework.maxLength(array2, array1));

    }
}

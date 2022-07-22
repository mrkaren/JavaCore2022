package homework.practiceExample;

public class PracticeExample {

    long convert(int minutes) {
        return minutes * 60L;
    }

    int calcAge(int years) {
        return years * 366;
    }

    int nextNum(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThenEqualToZero(int value) {
        return value <= 0;
    }


    boolean reverseBoolean(boolean b) {
        return !b;
    }

    int maxLength(int[] array1, int[] array2){
        return array1.length > array2.length ? array1.length : array2.length;
    }
}

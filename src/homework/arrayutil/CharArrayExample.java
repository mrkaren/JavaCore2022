package homework.arrayutil;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'v';

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("count = " + count);

        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex - 1]);
        System.out.println(chars[middleIndex]);

        char[] chars1 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int lastIndex = chars1.length - 1;
        boolean lyResult = false;
        if (chars1[lastIndex - 1] == 'l'
                && chars1[lastIndex] == 'y') {
            lyResult = true;
        }
        System.out.println("lyResult -> " + lyResult);

        char[] bobArray = {'j', 'i', 'v', 't', 'l', 'o', 'l', 'b'};
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;
            }
        }
        System.out.println("bobThere -> " + bobThere);
        char[] chars2 = {' ', ' ', 'j', ' ', 'i', 'v', 't', 'l', ' ', 'o', 'l', 'b', ' '};

        for (char c1 : chars2) {
            if (c1 != ' ') {
                System.out.print(c1);
            }
        }

    }

}

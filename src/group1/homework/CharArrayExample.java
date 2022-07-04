package group1.homework;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        char c = 'v';
//1
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("count = " + count);
//2
        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex - 1]);
        System.out.println(chars[middleIndex]);
//3
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        char x = chars3[chars.length - 2];
        char y = chars3[chars.length - 1];
        boolean result = false;
        if (x == 'l' && y == 'y') {
            result = true;
        }
        System.out.println(result);
//4
        char[] bobArray = {'c', 'a', 't', 'b', 'i', 'b'};
        boolean bobResult = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobResult = true;
                break;
            }
        }
        System.out.println("bobResult=" + bobResult);

        //5
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b'};
        for (char c1 : spaceArray) {
            if (c1 != ' ') {
                System.out.print(c1);
            }
        }
    }

}

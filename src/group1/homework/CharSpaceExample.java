package group1.homework;

public class CharSpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' ', ' '};

        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }

        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }

        int newLength = (endIndex - startIndex) + 1;
        char[] result = new char[newLength];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
           result[j++] = spaceArray[i];
        }

        for (char c : result) {
            System.out.print(c);
        }
    }
}

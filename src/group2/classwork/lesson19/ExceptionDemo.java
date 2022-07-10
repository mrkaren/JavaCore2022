package group2.classwork.lesson19;


import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            System.in.read();
        } catch (IOException e) {

        }
        try {
            printWithoutWhiteSpace(null);
        } catch (Exception e) {

        }

    }

    static String printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("value can't be null");
        }
        if (value.equals("")) {
            throw new IllegalArgumentException("value can't be empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException();
        }
        return value.trim();
    }

}

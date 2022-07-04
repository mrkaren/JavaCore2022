package group1.classwork.lesson18;

import group1.classwork.students.model.Student;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            printStringWithoutWhiteSpace("null");
        } catch (NoWhiteSpaceException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am finally");
        }

        System.out.println("After try block");
    }

    static void printStringWithoutWhiteSpace(String name) {
        if (name == null) {
            throw new NullPointerException("name is null");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("name can't be empty");
        }
        if (!name.contains(" ")) {
            throw new NoWhiteSpaceException("name does not contains white spaces");
        }

        System.out.println(name.trim());
    }
}

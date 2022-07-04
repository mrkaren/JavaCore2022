package group1.classwork.lesson12;

public class OverloadDemo {

    void test() {
        System.out.println("I am test");
    }
    String test(double a) {
        System.out.println("I am test");
        return "";
    }

    void test(int a) {
        System.out.println("I am test(int a)");

    }

    void test(String a) {
        System.out.println("I am test(String a)");
    }
    void test(String a, int b) {
        System.out.println("I am test(String a)");
    }

}

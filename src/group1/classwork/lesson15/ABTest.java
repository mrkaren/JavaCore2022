package group1.classwork.lesson15;

public class ABTest {

    public static void main(String[] args) {

        B b = new B(5);
        b.showB();
        A a = b;
        b.a = 6;
        System.out.println(a.a);


    }
}

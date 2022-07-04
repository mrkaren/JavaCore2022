package group1.classwork.lesson16;

public class MyDemo {

    public static void main(String[] args) {


        A a = new A();
        B b = new B();
        C c = new C();
//        printKuku5times(b);
//        printKuku5times(a);
        c.printKuKu();
    }

    static void printKuku5times(MyInterface myInterface){
        for (int i = 0; i < 5; i++) {
            myInterface.printKuKu();
        }
    }

}

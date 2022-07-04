package group1.classwork.lesson14;

public class A {

    static void meth(int ... a){
        for (int i : a) {
            System.out.println(i);
        }
    }

    static class B {
        public int x = 7;
    }
}


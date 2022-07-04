package group1.classwork.lesson15;

public class C extends A {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new C();
    }

    @Override
    void meth1() {

    }
}

package group1.classwork.lesson14;

public class Block {

    private final int a;
    static int b = 19;

    static {
        System.out.println("I am static block");
        System.out.println(b);
    }
    Block(){
        a = 8;
    }
    Block(int x){
        a = x;
    }

    public int getA() {
        System.out.println(Block.b);
        return a;
    }
}

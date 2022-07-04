package group2.classwork.lesson11.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(5);
        myStack.push(4);
        myStack.push(9);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(8);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

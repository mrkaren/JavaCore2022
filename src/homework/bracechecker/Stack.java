package homework.bracechecker;


public class Stack {

    private int[] array = new int[10];
    private int index;

    public Stack() {
        index = -1;
    }

    public void push(int value) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            array[++index] = value;
        }
    }

    public int pop() {
        if (index < 0) {
            return 0;
        }
        return array[index--];
    }

    public boolean isEmpty(){
        return index == -1;
    }

}

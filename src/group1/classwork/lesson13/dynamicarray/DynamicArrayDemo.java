package group1.classwork.lesson13.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        array.add(8);
        array.add(86);
        array.add(76);
        array.add(0);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(4);
        array.print();
//        array.set(1, 96);
//        array.add(1,98);
//        array.delete(1);

        System.out.println(array.getFirstIndexByValue(3));


    }
}

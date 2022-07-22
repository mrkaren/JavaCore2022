package classwork.lesson13.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.add(7);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(0);
        dynArray.add(3);
        dynArray.add(28);
        dynArray.add(65);
        dynArray.add(65);
        dynArray.print();
        dynArray.deleteByIndex(5);
        dynArray.print();


    }
}

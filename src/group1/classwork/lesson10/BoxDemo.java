package group1.classwork.lesson10;

public class BoxDemo {
    public static void main(String[] args) {

        Box box1 = new Box(10,20,30);

        double vol = box1.volume();
        System.out.println(vol);
        System.out.println(vol * 2);

        Box box2 = new Box(4,2,3);

        System.out.println(box2.volume());


    }
}

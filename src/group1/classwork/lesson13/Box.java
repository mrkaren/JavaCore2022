package group1.classwork.lesson13;

public class Box {

    public double width;
    public double height;
    public double depth;
    public final int WARRANTY_YEAR = 1;

    public static String color = "red";

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public double volume() {
      return width * height * depth;
    }

    public boolean equalTo(Box box) {
        return box.width == this.width
                && box.height == this.height
                && box.depth == this.depth;
    }

    public static void meth() {
        System.out.println("method");
    }
}

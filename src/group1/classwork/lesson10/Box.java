package group1.classwork.lesson10;

public class Box {

    public double width;
    public double height;
    public double depth;

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
}

package group1.classwork.lesson15.box;

import group1.classwork.lesson15.staticTest.B;

public class BoxDemo {

    public static void main(String[] args) {
        ColorBox colorBox = new ColorBox(1, 2, 3, 4);
        BoxWeight boxWeight = new BoxWeight(4, 5, 6, 10);
        Shipment shipment = new Shipment(4, 5, 6, 10, 600);
        printDoubleVolume(colorBox);
//        printDoubleVolume(boxWeight);
//        printDoubleVolume(shipment);
    }

    public static void printDoubleVolume(Box box) {
        System.out.println(box.volume() * 2);
        if (box instanceof ColorBox) {
            ColorBox colorBox = (ColorBox) box;
            System.out.println(colorBox.color);
        }

    }

}

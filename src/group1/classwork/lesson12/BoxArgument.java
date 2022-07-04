package group1.classwork.lesson12;

import group1.classwork.lesson10.Box;

public class BoxArgument {

    void printBoxDim(Box box) {
        System.out.println(box.width);
        System.out.println(box.height);
        System.out.println(box.depth);
        box.width = 19;
    }

}

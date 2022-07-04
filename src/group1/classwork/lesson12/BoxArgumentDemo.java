package group1.classwork.lesson12;

import group1.classwork.lesson10.Box;

public class BoxArgumentDemo {

    public static void main(String[] args) {
        BoxArgument boxArgument = new BoxArgument();
        Box myBox = new Box(1, 2, 3);
        boxArgument.printBoxDim(myBox);
        Box myBox2 = new Box(1, 2, 3);

        System.out.println(myBox2.equalTo(myBox));

    }


}

package group1.classwork.lesson16;

public interface MyInterface {

    String NAME = "Poxos";

    default void printKuKu(){
        System.out.println("k u k u");
        printNewLine();
    }

    private static void printNewLine(){
        System.out.println();
    }



}

package group1.classwork.lesson20;

public class SomeClass {

    @MyAnno(str = "234", val = 3)
    private String name;

    @MyAnno(str = "asdf", val = 3)
    @CustomAnnotation
    private static void meth(){

    }

}

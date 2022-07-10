package group1.classwork.lesson20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) {


        Method method = null;
        try {
            method = SomeClass.class.getDeclaredMethod("meth");
//            method.setAccessible(true);
            Annotation[] declaredAnnotations = method.getAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation.toString());
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}

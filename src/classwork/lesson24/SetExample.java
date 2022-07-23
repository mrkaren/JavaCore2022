package classwork.lesson24;

import classwork.students.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();


        hashSet.add("poxos");
        hashSet.add("martiros");
        hashSet.add("aram");
        hashSet.add("babken");
        hashSet.add("zaven");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}

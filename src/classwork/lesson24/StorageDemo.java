package classwork.lesson24;

import classwork.students.model.Student;

import java.awt.print.Book;

public class StorageDemo {

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(7);

        Storage<String> strStorage = new Storage<>();

        strStorage.add("9");
        String str = strStorage.getByIndex(0);


        Storage<Student> studentStorage = new Storage<>();

        studentStorage.add(new Student());

        Student student = studentStorage.getByIndex(0);



    }
}

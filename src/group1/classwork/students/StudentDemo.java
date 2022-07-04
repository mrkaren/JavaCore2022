package group1.classwork.students;

import group1.classwork.students.command.Commands;
import group1.classwork.students.exception.LessonNotFoundException;
import group1.classwork.students.model.Lesson;
import group1.classwork.students.model.Student;
import group1.classwork.students.storage.LessonStorage;
import group1.classwork.students.storage.StudentStorage;

import java.util.*;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher name 1", 33, 55);
        lessonStorage.add(java);
        Lesson javaScript = new Lesson("java script", "teacher name 2", 33, 55);
        lessonStorage.add(javaScript);
        Lesson mysql = new Lesson("mysql", "teacher name 3", 33, 55);
        lessonStorage.add(mysql);

        studentStorage.add(new Student("Poxos", "Poxosyan", 13, "1234567", "Gyumri", java));
        studentStorage.add(new Student("Petros", "Poxosyan", 13, "1234567", "Gyumri", mysql));
        studentStorage.add(new Student("Martiros", "Poxosyan", 13, "1234567", "Gyumri", javaScript));
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteStudentByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    searchStudentByLessonName();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }

    }

    private static void addLesson() {

        System.out.println("Please input lesson name");
        String name = scanner.nextLine();

        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input lesson teacher name");
        String teacherName = scanner.nextLine();

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson created!");

    }

    private static void searchStudentByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                student.setLesson(lesson);
                System.out.println("Lesson changed!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                changeStudentLesson();
            }
        } else {
            System.out.println("invalid index, please try again");
            changeStudentLesson();
        }


    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("Please input student name");
                String name = scanner.nextLine();
                System.out.println("Please input student surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student age");
                String ageStr = scanner.nextLine();
                System.out.println("Please input student phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student city");
                String city = scanner.nextLine();

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Thank you, Student added");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                addStudent();
            }

        }


    }
}

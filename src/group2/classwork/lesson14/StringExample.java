package group2.classwork.lesson14;

public class StringExample {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            result.append("poxos");
            result.append(i);
            result.append(" ");
        }
        System.out.println(result);
    }
}

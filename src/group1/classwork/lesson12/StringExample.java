package group1.classwork.lesson12;

public class StringExample {

    public static void main(String[] args) {
        String name = "Poxosik/Poxosyan/Poxosi";
        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'o'){
                result += "o".toUpperCase();
            }else {
                result += chars[i];
            }
        }
        System.out.println(result);

    }

}

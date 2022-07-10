package group2.classwork.lesson20;

public class EnumTest {

    public static void main(String[] args) {
        String genderStr = "sadfghjk";
        try {
            Gender gender = Gender.valueOf(genderStr.toUpperCase());
            System.out.println(gender);
        } catch (IllegalArgumentException e) {
            System.out.println("please input correct gender");
        }

    }

}

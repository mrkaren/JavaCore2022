package group1.classwork.lesson19;

public class EnumTest {

    public static void main(String[] args) {
        Language language = Language.CH;
        System.out.println(language);
        switch (language) {
            case EN:
                System.out.println("hello");
                break;
            case RU:
                System.out.println("Привет");
                break;
            case HY:
                System.out.println("Ողջույն");
                break;
            default:
                System.out.println("hola");
        }

//        System.out.println("please input language");
//        Language[] values = Language.values();
//        for (Language value : values) {
//            System.out.print(value + ",");
//        }

//        String country = Language.EN.getCountry();
//        System.out.println(country);
//        System.out.println(Language.EN.getCountry());
//        try {
//            Gender gender = Gender.valueOf("kjhgfd");
//        }catch (IllegalArgumentException e) {
//            System.out.println("please input MALE or FEMALE");
//        }

        System.out.println(Language.EN.ordinal());
    }
}

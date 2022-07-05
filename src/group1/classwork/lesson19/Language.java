package group1.classwork.lesson19;

public enum Language {

    HY("Armenia"),
    RU("Russia"),
    EN,
    EN_USA("USA"),
    CH("China");

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {
    }

    public String getCountry() {
        return country;
    }

}

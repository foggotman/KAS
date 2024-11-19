package models;

public abstract class Person {
    private String navn;

    public Person(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }
}

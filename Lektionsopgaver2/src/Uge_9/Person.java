package Uge_9;

public class Person {
    private String Navn;


    public Person(String Navn) {

        this.Navn = Navn;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        this.Navn = navn;
    }

    @Override
    public String toString() {
        return "class Uge_9.Person\n\t[navn="+getNavn()+"]";
    }
}


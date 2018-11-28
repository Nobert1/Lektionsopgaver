/*
public class Modifiers {




    public String name;

    public Modifiers(String name1) {

        name = name1;

    }
    protected Modifiers string2 = new Modifiers("string2");
    Modifiers string1 = new Modifiers("string1");
    Modifiers string3 = new Modifiers("string3");
    Modifiers string4 = new Modifiers("string4");
    Modifiers string5 = new Modifiers("string5");
    Modifiers string6 = new Modifiers("string6");

    protected Modifiers getString2() {
        return string2;
    }

    private Modifiers getString1(){
        return string1;
    }

    public Modifiers getString3() {
        return string3;
    }

    final static Modifiers getString4(){
        return getString4();
    }
    Modifiers getString5() {
    return string5;
}



    }
    public class Modifiers1 extends Modifiers {
        private String string1;




        string1 - skal kun være synlig for objektet selv og indre klasser
        string2 - skal kun være synlig for objektet selv og nedarvende klasser
        string3 - skal være synlig for alle i pakken
        string4 - skal være synlig for alle i projektet
        string5 - skal være bundet til klassen og ens for alle objekter af samme type (også selv om den ændres)
        string6 - skal ikke kunne ændres når objektet er instantieret

*/
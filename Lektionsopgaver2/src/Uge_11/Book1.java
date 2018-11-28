package Uge_11;

public class Book1 extends ReadingMatter {

    private String titel;
    private long isbn;
    private String author;

    public Book1(String thisTitle, long isbnNum, String auth) {
        super(thisTitle, isbnNum);
        titel = thisTitle;
        isbn = isbnNum;
        author = auth;
    }
    @Override
    public String toString()
    {
        return titel + "\t" + isbn + "\t" + author;
    }

    @Override
    public void content() {
        System.out.println ("Title: " + titel);
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Author: " + author);
    }
}
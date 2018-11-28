package Uge_11;



public class ReadingMatter {

    private String titel;
    private long isbn;

    public ReadingMatter(String thisTitle, long isbnNum) {

        titel = thisTitle;
        isbn = isbnNum;

    }


    @Override
    public String toString() {
        return titel + "\t" + isbn;
    }

    public void content() {
        System.out.println("Title: " + titel);
        System.out.println("ISBN: " + isbn);

    }
}





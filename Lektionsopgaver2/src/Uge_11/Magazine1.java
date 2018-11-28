package Uge_11;

public class Magazine1 extends ReadingMatter {

   private int weeknumber;
   private String titel;
   private long isbn;
  
   public Magazine1 (String thisTitle, long isbnNum, int weeknumber1) {
      super(thisTitle, isbnNum);

      titel = thisTitle;
      isbn = isbnNum;
      weeknumber = weeknumber1;

   }
@Override
   public String toString()
   {
      return titel + "\t" + isbn + "\t" + weeknumber;
   }
@Override
   public void content()
   {
      System.out.println ("Title: " + titel);
      System.out.println ("ISBN: " + isbn);
      System.out.println ("Weeknumber: " + weeknumber);
   }
}




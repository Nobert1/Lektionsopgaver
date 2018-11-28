import java.util.Scanner;
public class Dato {
    Scanner scan = new Scanner(System.in);


    int year;
    int month;
    int day;
    String w;
    String x;
    String y;

    public Dato(int year1, int month1, int day1) {

        year = year1;
        month = month1;
        day = day1;


    }

    public String danish() {
        return (day + "/" + month + "-" + year);
    }

    public String danishText() {
        switch (month) {
            case 1:
                w = "Januar";
                break;
            case 2:
                w = "Februar";
                break;
            case 3:
                w = "Marts";
                break;
            case 4:
                w = "April";
                break;
            case 5:
                w = "Maj";
                break;
            case 6:
                w = "Juni";
                break;
            case 7:
                w = "Juli";
                break;
            case 8:
                w = "August";
                break;
            case 9:
                w = "September";
                break;
            case 10:
                w = "Oktober";
                break;
            case 11:
                w = "November";
                break;
            case 12:
                w = "December";
                break;
            default:
                break;


        }
        return (day + ". " + w + " " + year);
    }

    public String iso() {
        if (month < 10 && day > 9)
            return (year + "-" + "0" + month + "-" + day);
        else if (month > 9 && day < 10)
            return (year + "-" + month + "-" + "0" + day);
        else if (month > 9 && day > 9)
            return (year + "-" + "0" + month + "-" + "0" + day);
        else
        return (year + "-" + "0" + month + "-" + "0" + day);
    }
}

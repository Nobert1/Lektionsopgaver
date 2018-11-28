package Uge_12;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class WriteFile {
    BufferedWriter out;


    public void openFile(String file) {
        try {
            out = new BufferedWriter((new FileWriter(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInts(int[] ints) {
        //TODO: Din kode her!
        try {
        for (int i = 0; i < ints.length; i++) {
            out.write(Integer.toString(ints[i]) + "");
            out.newLine();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void closeFile() {
        //TODO: Din kode her!
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
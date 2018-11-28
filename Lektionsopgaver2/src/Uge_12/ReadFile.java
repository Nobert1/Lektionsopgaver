package Uge_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadFile {
    BufferedReader in;
    public void openFile(String file)  {
        try {
            in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int[] readInts() {

        int[] ints=null;
        return ints;
    }
    public void closeFile()  {
        try {

            in.close();
            //TODO: Din kode her
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
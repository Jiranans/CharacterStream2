package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {

    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("data.dat");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World");
            output.write("wellcome to Java");
            output.write("wellcome to Java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.dat");
            BufferedReader input = new BufferedReader(file);
            String ch; //buffer must String 
            while ((ch = input.readLine()) != null) {
                System.out.print(ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

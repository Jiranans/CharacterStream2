package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 {

    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.dat");
            output.write("Hello World");
            output.write("wellcome to Java");
             output.write("wellcome");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader input = new FileReader("data.dat");
            int ch;
            while((ch = input.read()) !=-1){
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

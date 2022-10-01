/* Write a Java program to append text to an existing file. */
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendFile {
    static File file;
    static FileWriter fw;
    static BufferedWriter bw;
    
    public static void main(String[] args) {
        
      try {
         //put value in string variable 
         String data = "Java is object oriented language";
         //creates a new file instance  
         file = new File("C:\\Appand.txt");
         if(!file.exists()) {
            file.createNewFile();
         }
         //write that file or insert values
         fw = new FileWriter(file.getName(),true);
         //buffer writer
         bw = new BufferedWriter(fw);
         bw.write(data);
         bw.close();
         System.out.println("Done");
        } 
        catch(IOException e) {
         System.out.println(e);
        }
   }
}
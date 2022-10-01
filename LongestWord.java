/* Write a Java program to find the longest word in a text file. */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {
   
    public String findLW() throws FileNotFoundException{
        String lw = "";
        String current;
        //Scanner class 
        Scanner sc = new Scanner(new File("/home/students/test.txt"));
              
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > lw.length()) {
                lw = current;
            }
        }
        System.out.println("\n"+lw+"\n");
        return lw;
    }
    public static void main(String[] args)throws FileNotFoundException {
            new LongestWord().findLW();
    }
}


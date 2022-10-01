/* Write a java program to read a file line by line and store it into a variable */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadF { 
    static File file;
    static FileReader fr;
    static BufferedReader br;
    static StringBuffer sb;

    public static void main(String args[]) {
        try {
            //creates a new file instance  
            file=new File("D:\\Stream.txt"); 
            //reads that file 
            fr=new FileReader(file); 
            //creates a buffer class  
            br=new BufferedReader(fr); 
            //constructs a string buffer with no characters  
            sb=new StringBuffer();    
            String line;  
            while((line=br.readLine())!=null) {
                //appends line to string buffer 
                sb.append(line);  
                //line feed  
                sb.append("\n");      
            } 
            //close the stream and release the resources  
            fr.close();    
            System.out.println("Contents of File: ");  
            //returns a string  
            System.out.println(sb.toString());   
        }
        catch(FileNotFoundException fe){
           System.out.println("This file is not found");
        }
        catch(IOException e) { 
            e.printStackTrace();  
        }  
        
    }
}
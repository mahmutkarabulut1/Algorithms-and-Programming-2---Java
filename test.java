package algoOdev2;

import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// This main class uses Employee class and inputQuiz 1.txt file.
public class test {

   
public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new 

FileReader("girdiQuiz1.txt"));
       
        
        while(true){
        String line = bufferedReader.readLine();
        
        if(line != null){
        
        
            if("Default".equals(line)){
                Employee emp;
                emp = new Employee();
                System.out.println(emp);
        
            }
            else{
                StringTokenizer str = new StringTokenizer(line,",");
            
 
                String nameSurname = str.nextToken();
                String ID = str.nextToken();
                String department = str.nextToken();
                String position = str.nextToken();
                Employee empl;
                empl = new Employee(nameSurname,department,position,Integer.valueOf(ID));
                System.out.println(empl);
            
            }
        }
        else{
            break;
        }
        }
        bufferedReader.close();
            
                
    }


}

   

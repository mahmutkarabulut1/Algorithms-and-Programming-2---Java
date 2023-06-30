package ControllerDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//This main class uses NumberController.java class and Numbers.txt file.
public class ControllerDemo {

    
    public static void main(String[] args)throws FileNotFoundException, IOException {
        
        File file = new File("Numbers.txt");
        NumberController number = new NumberController(file);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the a number: ");
        int a = scan.nextInt();
        System.out.println("Whether the number is in the file or not: " + number.searchBinary(a));
        
        System.out.println("Enter the a number: ");
        int b = scan.nextInt();
        System.out.println("Whether the number is in the file or not: "+ number.searchSequential(b));
        
        
        
    }
    
}

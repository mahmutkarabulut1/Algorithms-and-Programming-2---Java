package algoOdev1;

import java.util.Random;
import java.util.Scanner;

// The name of this play: Fruit Jackpot Spin the Reels and Win
// When the game starts, it asks you to enter a money amount 
// Then 3 random fruits will appear on the screen
// If two of these fruits are the same, the money is doubled 
// If all three are the same, the money is tripled
// If none of them are the same, the money is lost

public class algoOdev1 {

    public static void main(String[] args) {
        char cont = 'y';
        int finalMoney= 0;
        int totalLoss = 0;
        do
        {
            String name0 = "";
            String name1 = "";
            String name2 = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the amount of money: ");
            int a = scan.nextInt();
            totalLoss = totalLoss + a;

            Random rd0 = new Random();
            int value0 = rd0.nextInt(6);


            switch(value0){
                case 0 -> name0 = "strawberry";
                case 1 -> name0 = "orange";
                case 2 -> name0 = "apple";
                case 3 -> name0 = "banana";
                case 4 -> name0 = "cherry";
                case 5 -> name0 = "melon";
            }
            System.out.println(name0);

            Random rd1 = new Random();
            int value1 = rd1.nextInt(6);


            switch(value1){
                case 0 -> name1 = "strawberry";
                case 1 -> name1 = "orange";
                case 2 -> name1 = "apple";
                case 3 -> name1 = "banana";
                case 4 -> name1 = "cherry";
                case 5 -> name1 = "melon";
            }
            System.out.println(name1);

            Random rd2 = new Random();
            int value2 = rd2.nextInt(6);


            switch(value2){
                case 0 -> name2 = "strawberry";
                case 1 -> name2 = "orange";
                case 2 -> name2 = "apple";
                case 3 -> name2 = "banana";
                case 4 -> name2 = "cherry";
                case 5 -> name2 = "melon";
            }
            System.out.println(name2);

            //şimdi burda name 1 name 2 name0 karşılaştırması yapılabilir

            if(name0==name1 && name0==name1 && name1==name2){
                System.out.println("You won " +a*3+"TL");
                finalMoney = finalMoney + 3*a;
            }
            else if(name0 == name1 || name0==name2 || name1 == name2){
                System.out.println("You won "+a*2+"TL" );
                finalMoney = finalMoney + 2*a;
            }
            else{
                System.out.println("You loss.");
            }
            
            System.out.println("Do you want to continue? (y,Y,n,N): ");
            String input = scan.next();
            cont = input.charAt(0);
            
        } while(cont == 'y'|| cont == 'Y');
        
        
        System.out.println("Total Loss: "+ totalLoss);
        System.out.println("Net Income: " + (finalMoney-totalLoss));//toplam kaybı da hesaplamak lazım burda
        System.out.println("\nTotal Income: "+ finalMoney);
    
    }
}


    


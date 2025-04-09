import java.util.Scanner;
import java.util.Random;

public class SlotMachine{
     public static void main(String[] args){
     boolean run = true; 
     System.out.println("Welcome to Marcos Slot Machine!");
     
     Random rand = new Random();
     Scanner Scan = new Scanner(System.in);
     
     while(run){
          int rNum1 = rand.nextInt(7)+1;
          int rNum2 = rand.nextInt(7)+1;
          int rNum3 = rand.nextInt(7)+1;
          
          System.out.println(rNum1 + "|" + rNum2 + "|" + rNum3);
          
          if(rNum1 == 7 && rNum2 == 7 && rNum3 == 7){
               System.out.println("You win a major prize!");
               }
              else if((rNum1 == 7 && rNum2 == 7)||
                      (rNum2 == 7 && rNum3 == 7)||
                      (rNum3 == 7 && rNum1 == 7)){
                   System.out.println("You win a minor prize.");
               }
                else if(rNum1 == 7 || rNum2 == 7 || rNum3 == 7){
                     System.out.println("You win bad prize.");
                 }
                 else{
                     System.out.println("You don't win anything");
                 }
                 System.out.println("Would you wish to play again? y/n");
                 String choice = Scan.nextLine();
                 
                 if(choice.equals("y")){
                  continue;
                  }
                  else if(choice.equals("n")){
                     run = false;
                  }
                  else{
                      System.out.println("You entered a wrong  value");
                      run = false;
                  }
             }
             
             System.out.println("Thank you for playing.");
        }
    
}

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class GuessNum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        
        
        Random random_num = new Random();
        
        int random_number = random_num.nextInt(1,51);
        
        boolean f = false;
        int c = 0;
        
        int within = 5;
        
        for(int i=0;i<5;i++){
            
            System.out.println("Guess the number within "+within+" times between 1 to 50\n");
            within--;
    
   
            int user_inp = input.nextInt();
            
            if (user_inp > random_number){
                
                System.out.println("The number you guess greater");
            }
            if (user_inp < random_number){
                
                System.out.println("The number you guess smaller");
            }
            if (user_inp == random_number){
                
                System.out.println("Congratulations! You guess the correct number");
                f = true;
                break;
            }
            c++;
        }
        
        if (f==false){
            
            System.out.println("The number computer guess "+ random_number);
            
        }
        
        else{
            
            System.out.println("You guess the correct number within "+c+" times");
        }
        

    }
    
}

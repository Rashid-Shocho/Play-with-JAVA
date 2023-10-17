/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int play_time;
        int computer_score = 0;
        int user_score = 0;
        String[] list1 = {"Rock", "Paper", "Sessor"};

        System.out.print("How many times you want to play? \n");
        play_time = input.nextInt();

        for (int i = 0; i < play_time; i++) {
            
            
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.print("Enter your choice: 1.Rock 2.Paper 3.Sessor :   ");
            int user = input.nextInt();
            int computer_idx = random.nextInt(3);
            System.out.println("Computer has choosen: " + list1[computer_idx]);
            int user_idx = user - 1;
            
            
            if (user_idx>2 || user_idx<0){
                
                System.out.println("Invalied Input. Start Again");
                break;
            }

            if (computer_idx == user_idx) {
                continue;
            }
            if (computer_idx > user_idx && computer_idx - user_idx < 2) {
                computer_score += 1;
            }
            if (computer_idx > user_idx && computer_idx - user_idx == 2) {
                user_score += 1;
            }
            if (user_idx > computer_idx && user_idx - computer_idx < 2) {
                user_score += 1;
            }
            if (user_idx > computer_idx && user_idx - computer_idx == 2) {
                computer_score += 1;
            }
            System.out.println("Computer Score:  " + computer_score);
            System.out.println("Your Score:  " + user_score);
        }

        if (computer_score > user_score) {
            System.out.println("Sorry! You are lost.");
            
        } 
        else if(computer_score == user_score){
            System.out.println("Match is Tie..Wanna play again? ");
                    }
        
        else {
            System.out.println("Congratulations! You win against our super computer.");
        }
        System.out.println("Your Total Score: "+ user_score);
        System.out.println("Computer total Score: "+ computer_score);
    }
}
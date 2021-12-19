package com.mpstme;
/* Steps of Program Guessing Number Game
 * 1. Pick a random number range of 1-100. (Math Library)
 * 2. User give input until he bored (negative input)--> break
 * 3. Either Input is Too Large or too small
 * 4. Correct input then your answer is correct.
 * */

//Random Number = 85
//User Input == 41
//Too Small Choose Larger from them
//User Input = 95
//Too Large Choose Smaller from them
//User Input == -1
//Bye
//User Input == 85
//Win


import java.util.Scanner;

public class miniProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess the number (1-100): ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("Woohoo Correct Match");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println("Your Number is High");
            }
            else {
                System.out.println(" Your Number is low");
            }
        } while(userNumber >= 0);
        System.out.println("Our Random No is: ");
        System.out.println(myNumber);
    }
}


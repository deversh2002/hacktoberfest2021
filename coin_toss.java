package com.company;
import java.util.Scanner;
import java.util.Random;

public class coin_toss {
    public static void main(String[] args) {
        System.out.println("Lets play a coin toss game");
        System.out.println("Please select:\n\t0 for heads\n\t1 for tails  ");

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Heads or Tails?");
        int user_input = sc.nextInt();
        switch (user_input){
            case 0 -> System.out.println("You chose Heads");
            case 1 -> System.out.println("You chose Tails");
        }
        System.out.println("Lets see what the coin says");
        int toss_result = ra.nextInt(2);
        System.out.println(toss_result);
        switch (toss_result){
            case 0 -> System.out.println("It is Heads");
            case 1 -> System.out.println("It is Tails");
        }
        if (user_input == toss_result){
            System.out.println("Congrats you win");
        }
        else if ((user_input == 0 && toss_result == 1) || (user_input == 1 && toss_result == 0)){
            System.out.println("You lose bakayaro");

        }
    }
}

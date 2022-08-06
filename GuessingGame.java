package com.company;
import java.util.*;
public class GuessingGame
{
    void play()
    {
        System.out.print("Guess a Number Between 1 to 10: ");
        Scanner in=new Scanner(System.in);
        int ch=in.nextInt();
        Random num=new Random();
        int g=1+num.nextInt(10);
        if(g==ch)
        {
            System.out.println("WOOH! You Guessed it Correct!");
        }
        else
        {
            System.out.println("OPPS! The Number was "+g+"\nLet's Try Again.");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO GUESSING GAME");
        Scanner sc=new Scanner(System.in);
        GuessingGame ob=new GuessingGame();
        while(true)
        {
            System.out.println("\n\nOPTIONS\n1. START\n2. QUIT");
            System.out.print("Enter Your Choice: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    ob.play();
                    break;
                case 2:
                    System.out.println("Game Terminated!");
                    return;
            }
        }
    }
}

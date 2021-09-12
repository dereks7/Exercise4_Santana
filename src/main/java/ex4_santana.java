import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex4_santana
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a noun: " );
        Scanner in1 = new Scanner(System.in);
        String noun = in1.nextLine();
        System.out.println( "Enter a verb: " );
        Scanner in2 = new Scanner(System.in);
        String verb = in2.nextLine();
        System.out.println( "Enter an adjective: " );
        Scanner in3 = new Scanner(System.in);
        String adjective = in3.nextLine();
        System.out.println( "Enter an adverb: " );
        Scanner in4 = new Scanner(System.in);
        String adverb = in4.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " "+ noun + " "+ adverb+ "? That's hilarious!");
    }
}

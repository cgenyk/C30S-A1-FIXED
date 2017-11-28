/********************************************************************
 * Programmer:	Connor Genyk
 * Class:  CS30S
 *
 * Assignment: Assignment 1
 * Program Name:  Random Generator
 *
 * Description: Generates the random number file
 *
 * Input: None
 *
 * Output: List of 950 - 1000 random numbers ranging from 1-100
 **********************************************************************/

// ********** Java Import Statement **********

import java.util.Random;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class RandomGenerator {

    public static void main(String[] args) throws IOException { // begin main

        // ********* declaration of constants **********
        // None
        // ********** declaration of variables **********
        String bannerOut; // string to print banner to message dialogs
        Random randnum = new Random();
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Numbers.txt")));

        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Connor Genyk");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	A1");
        System.out.println("*******************************************");

        bannerOut = "*******************************************\n";
        bannerOut += "Name:		Connor Genyk\n";
        bannerOut += "Class:		CS30S\n";
        bannerOut += "Assignment:	A1\n";
        bannerOut += "*******************************************\n\n";

        fout.println("*******************************************");
        fout.println("Name:		Connor Genyk");
        fout.println("Class:		CS30S");
        fout.println("Assignment:	A1");
        fout.println("*******************************************");

        // ************************ get input **********************
        // None



        // ************************ processing ***************************


        Random rand = new Random();  // Random number generator




        // ************************ print output ****************************
        for (int num = 0; num < 950; num++) { // For loop to process random
            fout.printf("%1d ", rand.nextInt(100) + 1); // Prints to outfile
            System.out.printf("%1d ", rand.nextInt(100) + 1); // Prints to file

        }
        // ******** closing message *********
        System.out.println("end of processing."); // EOP Message
        fout.format("%n%nend of processing.");    // EOP Message

        // ***** close streams *****

        fout.close(); // close output buffer
    } // end main


} // end class

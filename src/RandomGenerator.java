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
    // begin class

    public static void main(String[] args) throws IOException{  // begin main

        // ********** declaration of variables **********
        String bannerOut;			// string to print banner to message dialogs
        Random rand = new Random();
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Numbers.txt")));

        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Connor Genyk");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	A1");
        System.out.println("*******************************************");


        System.out.println("INFO: Run Successfully.");
        System.out.println("------------------------");


        // ************************ processing ***************************

         for (int num=0;num < 950;num++)
        {
            fout.printf("%1d ",rand.nextInt(100)+1);
        }

        // ******** closing message *********
        System.out.println("end of processing.");

        // fout.format("%n%nend of processing.");
        // ***** close streams *****
        fout.close();			// close output buffer
    }  // end main

}  // end class
/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Ax Qy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/

// import java libraries here as needed
import java.util.Random;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class RandomGenerator {
    // begin class

    public static void main(String[] args) throws IOException{  // begin main

        // ********* declaration of constants **********
        // None
        // ********** declaration of variables **********
        String bannerOut;			// string to print banner to message dialogs
        Random randnum = new Random();
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Numbers.txt")));

        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Connor Genyk");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	A1");
        System.out.println("*******************************************");

        bannerOut = "*******************************************\n";
        bannerOut += "Name:		your name here\n";
        bannerOut += "Class:		CS20S\n";
        bannerOut += "Assignment:	A1\n";
        bannerOut += "*******************************************\n\n";

        fout.println("*******************************************");
        fout.println("Name:		your name here");
        fout.println("Class:		CS20S");
        fout.println("Assignment:	A1");
        fout.println("*******************************************");

        // ************************ get input **********************
        // None
        //String[] tokens = strin.split(delim);


        // ************************ processing ***************************
        Random rand = new Random();




        // ************************ print output ****************************
        for (int num=0;num < 950;num++)
        {
            fout.printf("%1d ",rand.nextInt(100)+1);
            System.out.printf("%1d ",rand.nextInt(100)+1);
            System.out.println();
        }
        // ******** closing message *********
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");

        // ***** close streams *****

        fout.close();			// close output buffer
    }  // end main


}  // end class
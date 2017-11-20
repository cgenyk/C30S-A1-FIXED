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
import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class Frequancy {
    // begin class

    public static void main(String[] args) throws IOException {  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs

        String prompt;
        Component promt = null;// prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        String tabSpace = "      ";    // six spaces
        Random randnum = new Random();

        int num = randnum.nextInt(50) + 1;
        int randomInt = randnum.nextInt(100) + 1;


        int[] frequency = new int[5];
        // int count = 0;
        String filename = ("Numbers.txt");

        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("$##.00");

        BufferedReader fin = new BufferedReader(new FileReader("Numbers.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("NumbersData.txt")));

        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		your name here");
        System.out.println("Class:		CS20S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");

        bannerOut = "*******************************************\n";
        bannerOut += "Name:		your name here\n";
        bannerOut += "Class:		CS20S\n";
        bannerOut += "Assignment:	Ax Qy\n";
        bannerOut += "*******************************************\n\n";

        fout.println("*******************************************");
        fout.println("Name:		your name here");
        fout.println("Class:		CS20S");
        fout.println("Assignment:	Ax Qy");
        fout.println("*******************************************");

        // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";


    	strin = JOptionPane.showInputDialog(bannerOut + prompt);
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
        //String[] tokens = strin.split(delim);


        // ************************ processing ***************************

            int list_size = 1000;
            int[] list2 = new int[list_size];
            int list_length = 0;
            int count_size = 100;
            int[] count = new int[count_size];
            int count_length = 100;

            fout.println(fin);



// ************************ print output ****************************


            // ******** closing message *********

            //System.out.println("end of processing.");
            fout.format("%n%nend of processing.");

            // ***** close streams *****

            //fin.close();			// close input buffer
            fout.close();            // close output buffer

        }  // end main

    }  // end class



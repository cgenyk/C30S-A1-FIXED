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
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;


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


        // ************************ processing **************************
        int token1 = 0;

// for-each loop for calculating heat index of May - October

// create Scanner inFile1
        Scanner inFile1 = new Scanner(new File("Numbers.txt"));

// Original answer used LinkedList, but probably preferable to use ArrayList in most cases
// List<String> temps = new LinkedList<String>();
        List<Integer> temps = new ArrayList<>();

// while loop
        while (inFile1.hasNextInt()) {
            // find next line
          token1 = inFile1.nextInt();

           temps.add(token1);
        }
        inFile1.close();

Collections.sort(temps);

     for (int i =0; i < temps.size(); i++) {

            System.out.println(temps.get(i));

        }








// ************************ print output ****************************


            // ******** closing message *********

            //System.out.println("end of processing.");
            fout.format("%n%nend of processing.");

            // ***** close streams *****

            //fin.close();			// close input buffer
            fout.close();            // close output buffer

        }  // end main

    }  // end class



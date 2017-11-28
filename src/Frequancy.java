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
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class Frequancy {
    // begin class

    public static void main(String[] args) throws IOException { // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        Component promt = null; // prompt for use in input dialogs

        int counter = 1; // Counts the frequancy
        int curnum = 0; // Current numbber
        int token1 = 0; // Reading the file
        int prevnum = 0; // Last number



        Scanner inFile1 = new Scanner(new File("Numbers.txt")); // scans the file


        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Connor Genyk");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	A1");
        System.out.println("*******************************************");


        // ************************ processing **************************

        // for-each loop for calculating heat index of May - October

        // create Scanner inFile1

        List<Integer> temps = new ArrayList<>(); // Makes the array

        // while loop
        while (inFile1.hasNextInt()) {
            // find next line
            token1 = inFile1.nextInt();

            temps.add(token1);
        }
        inFile1.close(); // closes file in

        Collections.sort(temps); // sorts in order
        prevnum = temps.get(0); // sets prevnum to 0


        for (int i = 1; i < temps.size(); i++) { // Loop for frequancy

            curnum = temps.get(i);
            if (curnum == prevnum) {
                counter++; // counts
            } else {
                System.out.println(prevnum + " " + counter); // prints out
                counter = 1;
                prevnum = curnum;


            }
        }



            System.out.println(prevnum + " " + counter); // prints 100


            // ************************ print output ****************************


            // ******** closing message *********

            //System.out.println("end of processing.");


            // ***** close streams *****

            inFile1.close();


        } // end main

    } // end class

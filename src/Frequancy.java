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

    public static void main(String[] args) throws IOException {  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        Component promt = null;// prompt for use in input dialogs

        int counter = 1;
        int curnum = 0;
        int token1 = 0;
        int prevnum = 0;


        Scanner inFile1 = new Scanner(new File("Numbers.txt"));



        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		your name here");
        System.out.println("Class:		CS20S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");


        // ************************ processing **************************

// for-each loop for calculating heat index of May - October

// create Scanner inFile1


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

prevnum = temps.get(0);


     for (int i =1; i < temps.size(); i++) {

         curnum = temps.get(i);
         if (curnum == prevnum){
             counter++;
         } else{
             System.out.println(prevnum+" "+ counter);
             counter=1;
             prevnum=curnum;
         }



        }

         System.out.println(prevnum+" "+counter);






// ************************ print output ****************************


            // ******** closing message *********

            //System.out.println("end of processing.");


            // ***** close streams *****

        inFile1.close();


    }  // end main

    }  // end class



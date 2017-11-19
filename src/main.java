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


public class Main {
     // begin class
    //FIX
        public static void main(String[] args) throws IOException{  // begin main

            // ********* declaration of constants **********

            // ********** declaration of variables **********

            String bannerOut;			// string to print banner to message dialogs
            Random randnum = new Random();
            int  num = randnum.nextInt(50) + 1;
            int randomInt = randnum.nextInt(100) + 1;




            //ConsoleReader console = new ConsoleReader(System.in);
            //DecimalFormat df1 = new DecimalFormat("$##.00");

            //BufferedReader fin = new BufferedReader(new FileReader("name of file"));
            PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Numbers.txt")));

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
            Random rand = new Random();
            for (int j=0;j < 950;j++)
            {
                fout.printf("%1d ",rand.nextInt(100)+1);
                System.out.printf("%1d ",rand.nextInt(100)+1);
                //System.out.print(rand.nextInt(100)+1);
                System.out.println();


            }

            //log("Done.");

    // ************************ print output ****************************



            // ******** closing message *********

            System.out.println("end of processing.");
            fout.format("%n%nend of processing.");

            // ***** close streams *****

            //fin.close();			// close input buffer
            fout.close();			// close output buffer
        }  // end main


}  // end class
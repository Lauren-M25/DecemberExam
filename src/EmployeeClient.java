/********************************************************************
 * Programmer: Lauren
 * 
 * Class: CS30S
 *
 * Assignment: Ax Qy
 *
 * Description: brief description of program.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class EmployeeClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;				// string data input from keyboard
        String strout;				// processed info string to be output
        String bannerOut;			// string to print banner to message dialogs

        String prompt;				// prompt for use in input dialogs

        String delim = "[ :]+";		// delimiter string for splitting input string
        String[] tokens;            // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
    	
    // ***** create objects *******
    
        Employee[] employees = new Employee [100];
        
        // file IO buffers, for reading data form a text file and writing output to a text file  
        BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name: Lauren");
        System.out.println("Class: CS30S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name: Lauren" + nl;
        bannerOut += "Class: CS30S" + nl;
        bannerOut += "Assignment: Ax Qy" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);		// prints the banner to the output text file
    	
    // ************************ get input **********************

        strin = fin.readLine();
        int i = 0;
        tokens = strin.split(delim);
        
        while(strin != null){
            int hours = Integer.parseInt(tokens[0]); // parse hours
            double wage = Double.parseDouble(tokens[1]); // parse wage
            employees[i] = new Employee(wage, hours);
            i++;
            strin = fin.readLine();
        }

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println("end of processing :)");
        fout.println("end of processing :)");
        
    // ***** close streams *****
        
        //fin.close();      // close input buffer stream
        fout.close();       // close output stream, note that nothing is printed 
        					// to the output file until the stream is closed		
        
    }  // end main
}  // end class

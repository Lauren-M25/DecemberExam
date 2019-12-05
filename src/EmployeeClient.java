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

        String delim = "[ :]+";		        // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();     // new line character for file writing
    	
    // ***** create objects *******
    
        Employee[] employees = new Employee [100];   // array of employees
        Employee amy = new Employee();     // amy the employee
        
        // file IO buffers, for reading data form a text file and writing output to a text file  
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name: Lauren");
        System.out.println("Class: CS30S");
        System.out.println("Assignment:	December Exam");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name: Lauren" + nl;
        bannerOut += "Class: CS30S" + nl;
        bannerOut += "Assignment: December Exam" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);		// prints the banner to the output text file
    	
    // ************************ get input **********************

        strin = fin.readLine();  // get input
        int i = 0;  // declare index variable
        
        while(strin != null){
            tokens = strin.split(delim); // declare tokens
            int hours = Integer.parseInt(tokens[0]); // parse hours
            double wage = Double.parseDouble(tokens[1]); // parse wage
            employees[i] = new Employee(wage, hours); // load employee into record array
            i++; // update index variable
            strin = fin.readLine(); // loop update statement
        } // end load employee records

    // ************************ processing ***************************
        
        amy.setWage(30.00); // set amy's wage
        amy.setHours(47); // set amy's hours

    // ************************ print output ****************************
    
        for(int j = 0; j < i; j++){
        System.out.println(employees[j].toString());
        } // end print employee records
        
        amy.toString(); // print amy's records
        
    // ******** closing message *********
        
        System.out.println("end of processing :)");
        fout.println("end of processing :)");
        
    // ***** close streams *****
        
        fin.close();        // close input buffer stream
        fout.close();       // close output stream, note that nothing is printed 
                            // to the output file until the stream is closed		
        
    }  // end main
}  // end class

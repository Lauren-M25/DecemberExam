/********************************************************************
 * Programmer: Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: Employee class will create an employee file with an id number, 
 * hourly wage, and hours worked in a week.
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
        
        public static int nextId = 1000;
        
    //*** Instance Constants ***
    
        private final int maxRegHours = 40;
        
    //*** Instance Variables ***
    
        private int Id = 0;
        private double wage = 0.0;
        private int hours = 0;
        
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    /*****************************************
    * Description: default constructor: create an employee with 
    * wage and hours worked set to 0.
    * 
    * ****************************************/
        
        public Employee(){
            this.Id = nextId++;
            this.wage = 0.0;
            this.hours = 0;
            
        } // end of default constructor
        
    /*****************************************
    * Description: initialized constructor: create an employee with wage 
    * and hours worked passed in.
    * 
    * Interface:
    * 
    * @param        wage: double, hourly wage
    * @param        hours: int, number of hours worked in a week
    * ****************************************/
        
        public Employee(double wage, int hours){
            this.Id = nextId++;
            this.wage = wage;
            this.hours = hours;
        } // end initialized constructor
        
    //*** Getters ***
    
    /*****************************************
    * Description: get employee id
    * 
    * Interface:
    * 
    * @return      Id: int, employee's ID
    * ****************************************/    
    public int getId(){
        return this.Id;
    } // end getId
    
    /*****************************************
    * Description: get employee wage
    * 
    * Interface:
    * 
    * @return      wage: double, hourly wage
    * ****************************************/    
    public double getWage(){
        return this.wage;
    } // end getWage
    
    /*****************************************
    * Description: get number of hours worked
    * 
    * Interface:
    * 
    * @return      hours: int, number of hours worked
    * ****************************************/    
    public int getHours(){
        return this.hours;
    } // end getHours
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @return      grossPay: double, total pay
    * ****************************************/    
    public double getGrossPay(){
        
         double grossPay = this.getRegPay() + this.getOverPay();
                 
         return grossPay;
    }
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @return      regPay: double, regular pay
    * ****************************************/    
    public double getRegPay(){
        
        double regPay = 0;
        
        if(this.hours > maxRegHours){
            regPay = this.wage * (this.hours - maxRegHours);
        } else {
            regPay = this.wage * this.hours;
        }
        return regPay;
    }
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @return      overPay: double, over pay
    * ****************************************/    
    public double getOverPay(){
        
        double overPay = 0;
        if(this.hours > maxRegHours){
            overPay = this.wage * 1.5 * (this.hours - maxRegHours);
        } else {
            overPay = 0;
        }
        
        return overPay;
    }
    
    /*****************************************
    * Description: the purpose of this override method is to print circle details
    * 
    * Interface:
    * 
    * @return       s: String, employee info
    * ****************************************/
        
        public String toString(){
            String s = "";
            
            s = String.format("%-10s %10.5f %s", "Employee ID: ", this.Id, "\n");
            s += String.format("%-10s %10.5f %s", "Wage: ", this.wage, "\n");
            s += String.format("%-10s %10.5f %s", "Hours worked: ", this.hours, "\n");
            s += String.format("%-10s %10.5f %s", "Regular Pay: ", this.getRegPay(), "\n");
            s += String.format("%-10s %10.5f %s", "Over Pay: ", this.getOverPay(), "\n");
            s += String.format("%-10s %10.5f %s", "Gross Pay: ", this.getGrossPay(), "\n");
            
            return s;
        } // end toString overloader
        
    //*** Setters ***

    /*****************************************
    * Description: set wage
    * 
    * Interface:
    * 
    * @param       newwage: double, new employee wage
    * ****************************************/    
    public void setWage(double newwage){
        this.wage = newwage;
    } // end setWage
    
    /*****************************************
    * Description: set hours
    * 
    * Interface:
    * 
    * @param       newhours: double, new employee wage
    * ****************************************/    
    public void setHours(int newhours){
        this.hours = newhours;
    } // end setHours
    
} // end of public class

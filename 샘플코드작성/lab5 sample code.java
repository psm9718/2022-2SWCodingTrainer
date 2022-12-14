1-a. Two
1-b. Four
1-c. They occur compiletime errors.
(https://www.javatpoint.com/method-hiding-in-java)
(static method는 클래스 단위로 이루어지며, runtime에 JVM에 의해 method가 결정되는 method overriding과 달리, compile time에 결정됨.)

2.
public class Employee extends Person {
    private double payRate;    
    private double workHours;
    private String deptName;
   
    public final int HOURS = 35;
    public final double OVERTIME = 1.2;
  
    //default constructor
    public Employee() {
        super(double payRate, double workHours, String deptName);
    }
    //add an alternate constructor with parameters
    
    public String toString() {
        //should return a String like this:
        //The wages for xxxx from the xxxx department are: $xxxxx.xx"
        return super.toString() + "The wages for " + workHours + " from the " + deptName + " department are : $" + payRate;
    
    }
    public void print() {
        //Should print output like this (same line):
        //The employee xxxx from the xxxx department worked xx hours
        //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx
        System.out.println("The employeee" + first + "from the " + getDepartment() +" department worked" + getHoursWorked() + "with a pay rate of $" + getpayRate() +". The wages for this employee are $"+ calculatePay());
    }
    public double calculatePay() {
        //Method to calculate and return the wages
        //handle both regular and overtime pay
        return this.payRate * OVERTIME * HOURS;
    }
    public void setAll(String first, String last, double rate, double hours, String dep){
        this.payRate = rate;
        this.workHours = hours;
        this.deptName = dep;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return workHours;
    }    
    public String getDepartment() {
        return deptName;
    }    
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        Employee other = (Employee) o;
        
        return payRate == o.payRate;
    }
    public Employee getCopy() {
        return first;
    }    
    public void copy(Employee e) {
        e.payRate = payRate;
        e.workHours = workHours;
        e.deptName = deptName;
    }
}

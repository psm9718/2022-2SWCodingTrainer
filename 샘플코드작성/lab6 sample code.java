1.
public class SavingsAccount{
   private double balance; //Account Balance
   private double monthlyInterestRate; 
   private double totalDeposits; 
   private double totalInterest; 

    public SavingsAccount(double startBalance, double annual_Interest_Rate)
    {
        balance = startBalance;
        annualInterestRate = annual_Interest_Rate; 
    }

   public void setAnnualInterestRate(double annual_Interest_Rate)
   {
       monthlyInterestRate = annualInterestRate / 12; 
   }
   public void setDeposit(double amount)
   {
       balance += amount; 
       totalDeposits += amount; 
   }
   public void calculateMonthlyInterest()
   {
       totalInterest = totalInterest + balance * monthlyInterestRate; 
       balance = balance + balance * monthlyInterestRate; 
   }
   public double getBalance()
   {
       return balance; 
   }

   public double getAnnualInterestRate()
   {
       return annualInterestRate; 
   }
   public double getMonthlyInterestRate()
   {
       return monthlyInterestRate; 
   }
   public double getTotalDeposits()
   {
       return totalDeposits; 
   }

   public double getTotalnterest()
   {
       return totalInterest; 
   }

   public void displayData()
   {
       balance = Math.round(balance * 100.0) / 100.0; 
       totalInterest = Math.round(totalInterest * 100.0) / 100.0; 
       System.out.println(); 
       System.out.println("The ending balance is: $" + balance); 
       System.out.println("Total amount of deposits: $" + totalDeposits);
 
       System.out.println("Total interest earned: $" + totalInterest);
   }
}

2.
Patient.java

public abstract class Patient{
  private int patNum;
  private double initialPayment, expenses;
  
  public Patient(){
    this.patNum = 0;
    this.initialPayment = this.expenses = 0.0;
 }

   public void setpatNum(double p, double s, double i, double d)
   {
       patNum = p;
       priceoftheSurgery = s;
       initialPayment = i;
       priceofdrugs = d;
   }
   public void computeExpenses()
   {
       Expense = priceoftheSurgery+initialPayment +priceofdrugs;
       totalDeposits += amount;
       Expenses = initialPayment +priceofdrugs+ Lab;
   }
   public double getpriceoftheSurgery()
   {
       return priceoftheSurgery; 
   }

   public double getpriceofdrugs(){
       return priceofdrugs; 
   }
   public double getinitialPayment(){
       return initialPayment; 
   }
}

1.
import textio.TextIO;

public class Quadratic{
    public static void main(String[] args){
        double A, B, C;
        double solution;
        boolean goAgain;
                        
        System.out.println("This program will print a solution of an equation");
        System.out.println("of the form A*X*X + B*X + C = 0, where A, B, and");
        System.out.println("C are values that you enter.");
      
        do{
            System.out.println();
            System.out.println("Enter values for A, B, and C:");
            System.out.print("A = ");
            A = TextIO.getlnDouble();
            System.out.print("B = ");
            B = TextIO.getlnDouble();
            System.out.print("C = ");
            C = TextIO.getlnDouble();
            System.out.println();
        
            try{
                solution = root(A,B,C);
                System.out.println("A solution of the equation is " + solution);  
            }
            catch(IllegalArgumentException e){
                System.out.println("Sorry, I can't find a solution.");
                System.out.println(e.getMessage());
            }
        
            System.out.println();
            System.out.print("Do you want to solve another equation? ");
            goAgain = TextIO.getlnBoolean();

        } while(goAgain);

    }
   
    static public double root( double A, double B, double C ) throws IllegalArgumentException{
        if (A == 0){
            throw new IllegalArgumentException("A can't be zero.");
        }
        else{
            double disc = B*B - 4*A*C;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminant < zero.");
            return  (-B + Math.sqrt(disc)) / (2*A);
        }   
    }   
}


2.
public class Test{
    public static void main(String[] args){
        double[] numbers;
        int numCt;
        double num;
    
        numbers = new double[100];
        numCt = 0;
    
        TextIO.putln("Enter up to 100 positive numbers; Enter 0 to end");
    
        while (true){
            TextIO.put("? ");
            num = TextIO.getlnDouble();
            if (num <= 0)
                break;
            insert(numbers, numCt, num);
            numCt++;
        }
      
        TextIO.putln("\nYour numbers in sorted order are:\n");
    
        for (int i = 0; i < numCt; i++){
            TextIO.putln( numbers[i] );
        }
    
    }
    
    static void insert(double[] A, int itemsInArray, double newItem){
        int loc = itemsInArray - 1;
        while (loc >= 0 && A[loc] > newItem){
            A[loc + 1] = A[loc];
            loc = loc - 1;
        }
        A[loc + 1] = newItem;
    }
}

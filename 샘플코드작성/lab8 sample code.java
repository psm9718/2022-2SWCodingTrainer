1.
class SMARTPHONE{
    double price;
    // nested class
    class OS{
    // members of nested class
        String name;
        double getVersion(){
            return 2.0;
        }
    }

    // nested protected class
    protected class Memory{
        // members of protected nested class
        String type;
        int getMemorySize(){
            return 64;
        }
    }
}

public class Main{
    public static void main(String[] args){
    // create object of Outer class SMARTPHONE
    //Insert your code here
    SMARTPHONE smartphone = new SMARTPHONE();
    
    // create an object of inner class OS using outer class
    //Insert your code here
    SMARTPHONE.OS os = smartphone.new OS();
    
    // create an object of inner class Memory using outer
    //Insert your code here
    SMARTPHONE.Memory memory = smartphone.new Memory();
    //Print the OS version and the size of memory
    //Insert your code here.
    System.out.println("OS version is " + os.getVersion());
    System.out.println("Memory size (in GB) is " + memory.getMemorySize());

}


2.
public class Lambda{
    public static arrayInterface counter(double value){
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if ( array[i] == value )
                    count++;
            }
            return count;
        };
    }
    
    public static final arrayInterface maxer = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > max)
                max = array[i];
        }
        return max;
    };
    
    public static final arrayInterface miner = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min)
                min = array[i];
        }
        return min;
    };
    
    public static final arrayInterface sumer = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };
    
    public static final arrayInterface averager = array -> sumer.apply(array) / array.length;
    
    public static void main(String[] args) {
        double[] List = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        System.out.println("Sum of list (should be 55): " + sumer.apply(List));
        System.out.println("Average of list (should be 5.5): " + averager.apply(firstList));
        System.out.println("Minimum of list (should be 1): " + miner.apply(List));
        System.out.println("Maximum of list (should be 10): " + maxer.apply(List));
        System.out.println("Count of 1 in list (should be 1): " + counter(1).apply(List));
        System.out.println("Count of 20 in second list (should be 0): " + counter(20).apply(List));
    }
}

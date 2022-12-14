1.
class BANK {
    int money;
    
    BANK(int money){
        this.money = money;
    }
    
    public int myBalance(){
        int bank = money;
        return bank;
    }
}

class main {
    public static void main(String[] args){
        BANK BankX = new BANK(500);
        BANK BankY = new BANK(800);
        BANK BankZ = new BANK(1200);
        
        System.out.println("BankX : " + BankX.myBalance());
        System.out.println("\nBankY : " + BankY.myBalance());
        System.out.println("\nBankZ : " + BankZ.myBalance());
        
    }
}
2.
class Employee {
    private int ID;
    private String name;
    private String joblevel;
    private double salary;
    private String address;
    
    public Employee(String n, String a){
        name = n;
        address = a;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    
    public static void main(String[] args){
        Employee e = new Employee("David", "Daegu");
        System.out.println("Name: " + e.getName() + "\n" + "Address: " + e.getAddress());
    }
}

3.
class Employee {
    private int ID;
    private String name;
    private String joblevel;
    private double salary;
    private double overtime;
    private String address;
    
    public Employee(String n, String a, double s, double o){
        name = n;
        address = a;
        salary = s;
        overtime = o;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double netSalary(){
        if (overtime <= 0){
            return salary;
        }
        else if (overtime > 0 && overtime < 10){
            salary = salary + overtime * 7.5;
            return salary;
        }
        else {
            salary = salary + 10*7.5 + (overtime - 10)*5;
            return salary;
        }
    }
    
    public static void main(String[] args){
        Employee e = new Employee("David", "Daegu", 5000, 10);
        System.out.println("Name: " + e.getName() + "\nAddress: " + e.getAddress() + "\nSalary: " + e.netSalary());
    }
}

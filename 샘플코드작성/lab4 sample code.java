class Student{
    private String StdName;
    private int StdAge;
    private double StdGPA;
    
    public void setName(String studentName){
        this.StdName = studentName;
    }
    public void setAge(int studentAge){
        if(studentAge <= 0){
            System.out.println("Wrong Age!!");
            System.exit(0);
        }
        else this.StdAge = studentAge;
    }
    public void setGPA(double studentGPA){
        if(studentGPA <= 0){
            System.out.println("Wring GPA!!");
            System.exit(0);
        }
        else this.StdGPA = studentGPA;
    }
    public String getName(){
        return StdName;
    }
    public int getAge(){
        return StdAge;
    }
    public double getGPA(){
        return StdGPA;
    }
}

public class StudentCreate{
    public static void main(String[] args){
        Student one = new Student();
        
        one.setName("David");
        one.setAge(20);
        one.setGPA(-2);
        
        System.out.println("Name : "+one.getName());
        System.out.println("Age : "+one.getAge());
        System.out.println("GPA : "+one.getGPA());
    }
}

1.
package abstractClasses;
package interfaces;
import java.util.*;

public interface Article{
    String Date;
    int num;
    
    public void setDate(String Date){
        this.Date = Date;
    }
    
    public abstract String isOLD(Date){
        if(Date - 5 <= 2016){
            return false;
        }
        else return true;
    }
    public abstract int isPopular(num){
        if(num >= 100) return true;
        else return false;
    }
}

public class Journal implements Article{
    
    public abstract String isOLD(Date){
    if (isOLD() == false){
        System.out.println("Journal is old=False;");
    }
    else System.out.println("Journal is popular=True;")
    }
    
    public abstract int isPopular(num){
    if(ispopular() == false){
        System.out.println("Journal is popular=False;");
    }
    else System.out.println("Journal is popular=True;");
    }
}
public class Magazine implements Article{
    public abstract String isOLD(Date){
    if (isOLD() == false){
        System.out.println("Journal is old=False;");
    }
    else System.out.println("Journal is popular=True;")
    }
    
    public abstract int isPopular(num){
    if(ispopular() == false){
        System.out.println("Journal is popular=False;");
    }
    else System.out.println("Journal is popular=True;");
    }
}


public class Main{
    public static void main(String[] args){
        Journal J = new Journal("12-Dec-2020", 200);
        Magazine M = new Magazine("1-Jan-2018", 50);
        
        J.isOLD();
        J.isPopular();
        M.isOLD();
        M.isPopular();
        
    }
}


2.
public class Course {
    private String courseName;
    private String[] students;;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[1];
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int count = 0;
        String[] temp = new String[--numberOfStudents];
        for (String s : students) {
            if (s.equals(student)) {
                continue;
            } 
            temp[count] = s;
            count++;
        }
        students = temp;
    }

    public void clear() {
        String[] temp = new String[1];
        students = temp;
        numberOfStudents = 0;
    }
}
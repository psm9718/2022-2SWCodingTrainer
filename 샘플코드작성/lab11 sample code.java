1.
import java.util.ArrayList;

public class ArrayListMethods{
    public static void main(String[] args){
        ArrayList<String> A = new ArrayList<String>();

        A.add("Hello");
        A.add("hi");
        A.add("Good");

        System.out.println("A = " + A);

        ArrayList<String> B = new ArrayList<String>();

        B.add("Hi");
        B.add("Bad");
        B.add("Good");

        System.out.println("B = "+ B);
        
        ArrayList<Integer> Output = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            if(A[i] == B[i])
                Output.add(1);
            else
                Output.add(0);
        }
        System.out.println("Output = " + Output);
    }
}


2.
public class Author implements Comparable<Author>{
    String first; 
    String book; 
    int age;
    
    Author(String first, String book, int age){ 
        this.first = first; 
        this.book = book; 
        this.age = age; 
    }
    
    public String getFirstName(){ 
        return first; 
    }
    public String getBookName(){ 
        return book; 
    }
    public int getAuAge(){ 
        return age; 
    }
    public void setFirstName(String first){ 
        this.first = first; 
    }
    public void setBookName(String book){ 
        this.book = book; 
    }
    public void setAuAge(int age){ 
        this.age = age; 
    } 

    public int compareTo(Author a){         
        return this.first.compareTo(a.first);   
    }
}

class AuthorAgeComparator implements Comparator<Author>{
    public int compare(Author a1,Author a2){
        if(a1.age==a2.age)
            return 0;
        else if(a1.age>a2.age)
            return 1;
        else
            return -1;
    }
}

public class BookNameComparator implements Comparator<Author>{ 
    public int compare(Author a1,Author a2){   
        return a1.book.compareTo(a2.book); 
    }  
}
1.
public class AreaTester{
    public static void main(String[] args){
        //Suppose that the width is 10 and the height is 20
        Rectangle rect = new Rectangle(10, 20);
        double wid, hei;
        wid = rect.getWidth();
        hei = rect.getHeight();
        double area = wid * hei;
        System.out.println(area);
    }
}

2.
public class HollePrinter{
    public static void main(String[] args){
        String letters = "Hello, World!";
        letters = letters.replace("e", "t");
        letters = letters.replace("o", "e");
        letters = letters.replace("t", "o");
        System.out.println(letters);
    }
}

3. mystery is declared twice.

4.
public class DieSimulator{
    public static void main(String[] args){
        Random generator = new Random();
        
        int die = generator.nextInt(6) + 1;
        System.out.println(die);
    }
}

5.
public class Password {
    
    public static int PASS_LENGTH = 6;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
            "1. A password must have at least six characters.\n" +
            "2. A password consists of only letters and digits.\n"+
            "3. A password must contain at least three digits \n"+
            "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
    
    public static boolean is_Letter(char temp) {
        temp = Character.toUpperCase(temp);
        return (temp >= 'A' && temp <= 'Z');
    }


    public static boolean is_digits(char temp) {
        return (temp >= '0' && temp <= '9');
    }

    public static boolean is_Valid_Password(String pass){
        if(pass.length() < PASS_LENGTH) return false;

        int numcount = 0;
        for(int i = 0; i < pass.length(); i++){
            char temp = pass.charAt(i);
            
            if(is_digits(temp)) numcount++;
            else if(is_Letter(temp)) continue;
            else return false;
        }
        
        return(numcount >= 3);
    }
}

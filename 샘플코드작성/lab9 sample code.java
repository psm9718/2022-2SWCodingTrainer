1.
public class AdditionQuiz{
    private static int[] firstNumbers;
    private static int[] secondNumbers;
    private static int[] userAnswers;
    
    public static void main(String[] args){
        System.out.println();
        System.out.println("Welcome to the addition quiz!");
        System.out.println();
        createQuiz();
        administerQuiz(); // user's answers have to be stored in the array
        gradeQuiz();
    }

    private static void createQuiz(){
        firstNumbers = new int[10];
        secondNumbers = new int[10];
        for ( int i = 0; i < 10; i++ ) {
            firstNumbers[i] = (int)(Math.random() * 50 + 1);
            secondNumbers[i] = (int)(Math.random() * 50);
        }
    }

    private static void administerQuiz(){
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  What is %2d + %2d  ? ", questionNum, firstNumbers[i], secondNumbers[i]);
            userAnswers[i] = TextIO.getlnInt();
        }
    }

    private static void gradeQuiz(){
        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberCorrect = 0;
        int grade;
        for(int i = 0; i < 10; i++){
            int questionNum = i + 1;
            int correctAnswer = firstNumbers[i] + secondNumbers[i];
            System.out.printf("   Question %2d:  %2d + %2d  =  %2d.  ", questionNum, firstNumbers[i], secondNumbers[i], correctAnswer);
            if( userAnswers[i] == correctAnswer ) {
                System.out.println("You were CORRECT.");
                numberCorrect++;
            }
            else{
                System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
            }
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }
}

2.
public class GeneralQuiz{
    interface IntQuestion{
        public String getQuestion();
        public int getCorrectAnswer();
    }
    
    static class AdditionQuestion implements IntQuestion{
        private int a, b;
        public AdditionQuestion(){
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
        }
        public String getQuestion(){
            return "What is " + a + " + " + b + " ?";
        }
        public int getCorrectAnswer(){
            return a + b;
        }
    }

    static class SubtractionQuestion implements IntQuestion{
        private int a, b;
        public SubtractionQuestion(){
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
            if (b > a){
                int temp = a;
                a = b;
                b = temp;
            }
        }
        public String getQuestion(){
            return "What is " + a + " - " + b + " ?";
        }
        public int getCorrectAnswer(){
            return a - b;
        }
    }
    
    private static IntQuestion[] questions;
    private static int[] userAnswers;

    public static void main(String[] args){
        System.out.println();
        System.out.println("Welcome to the quiz");
        System.out.println();
        System.out.println("There are some math questions and a few non-math");
        System.out.println("questions, but the answer to every question is");
        System.out.println("an integer.");
        System.out.println();
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    private static void createQuiz(){
        questions = new IntQuestion[10];
        for ( int i = 0; i < 7; i++ ) {
            if (Math.random() < 0.5)
	            questions[i] = new AdditionQuestion();
	        else
	            questions[i] = new SubtractionQuestion();
        }
        questions[7] = new IntQuestion(){
            public String getQuestion(){
                return "How many states are there in the United States?";
            }
            public int getCorrectAnswer(){
                return 50;
            }
        };
        questions[8] = new IntQuestion(){
            public String getQuestion(){
                return "In what year did the First World War begin?";
            }
            public int getCorrectAnswer(){
                return 1914;
            }
        };
        questions[9] = new IntQuestion(){
            public String getQuestion(){
                return "What is the answer to the ultimate question " + "of life, the universe, and everything?";
            }
            public int getCorrectAnswer(){
                return 42;
            }
        };
    }        

    private static void administerQuiz(){
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s ", questionNum, questions[i].getQuestion());
            userAnswers[i] = TextIO.getlnInt();
        }
    }

    private static void gradeQuiz(){
        System.out.println();
        System.out.println("Here are the correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++){
            System.out.println("Question number " + (i+1) + ":");
            System.out.println("    " + questions[i].getQuestion());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ){
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            }
            else{
                System.out.println("    You said " + userAnswers[i] + ", which is INCORRECT.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }
}

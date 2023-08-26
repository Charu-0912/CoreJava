import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Test3 test3 = new Test3();

      /*  test3.firstQuestion();
        test3.secondQuestion();
        test3.thirdQuestion();
        test3.fourthQuestion();*/
        test3.fifthQuestion();

    }

    public void firstQuestion() {
        System.out.println(" 1. convert a string to lowercase ");

        System.out.println("Enter you string in uppercase");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Converted lowercase string is : " + str.toLowerCase());
    }

    public void secondQuestion() {
        System.out.println(" 2. WAP to replace spaces with underscores");

        String str = "To Lower Case";

        System.out.println("Modified string output is : " + str.replace(" ", "_"));

    }

    public void thirdQuestion() {
        System.out.println(" 3. This is the third question");

        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Dear " + str + " , Thanks a lot !!!");
        str = str.replace(str, "Test name");
        System.out.println("Dear " + str + " , Thanks a lot !!!");

    }

    public void fourthQuestion() {
        System.out.println(" 4. WAP to detect double and triple spaces in a string");
        String str = "This  is my  JAVA   programming";

        int singleSpaces = 0;
        int doubleSpaces = 0;
        int tripleSpaces = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1) == ' ' && str.charAt(i + 2) == ' ') {
                    tripleSpaces++;
                    i = i + 2;
                } else if (str.charAt(i + 1) == ' ') {
                    doubleSpaces++;
                    i = i + 1;
                } else {
                    singleSpaces++;
                }
            }
        }

        System.out.println("Single spaces : " + singleSpaces);
        System.out.println("Double spaces : " + doubleSpaces);
        System.out.println("Triple spaces : " + tripleSpaces);
    }

    public void fifthQuestion(){
        System.out.println("5. This is the fifth question");
        String str = "Hello Charudatt,\n\t You are selected as a Senior QA Engineer ! \nThanks, \nBMC Software's";
        System.out.println(str);
    }


}

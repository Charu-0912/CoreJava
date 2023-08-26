import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        System.out.println(" 1. Calculate the percentage of a student for 5 subjects");
        Test1 test1 = new Test1();
        test1.percentageCalculator(80, 52, 74, 72, 89);

        /*System.out.println(" 2. Take input from user and greet him according to the entered name");
        test1.secondTest();

        System.out.println(" 3. Verify whether number entered by use is integer or not");
        test1.thirdTest();*/

    }

    public void percentageCalculator(int subject1, int subject2, int subject3, int subject4, int subject5) {

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = ((double) totalMarks / 5);

        System.out.println("Total marks obtained out of 500 : " + totalMarks);
        System.out.println("Percentage is : " + percentage);

    }

    public void secondTest() {
        System.out.println("What is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Hello " + name + " have a great day !!!");
    }

    public void thirdTest() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            System.out.println("Entered number is an integer number");
        } else {
            System.out.println("Entered number is not an integer number");
        }
    }


}

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Test2 test2 = new Test2();
/*      test2.firstQuestion();
        test2.secondQuestion('B');
        test2.thirdQuestion();*/
        test2.fourthQuestion();
    }

    public void firstQuestion() {
        float num = 7 / 4.0f * 9 / 2.0f;
        System.out.println("Output is : " + num);

    }

    public void secondQuestion(char grade) {
        System.out.println("Enter you grade : " + grade);

        grade = (char) (grade + 8);
        System.out.println("Grade shown to your father is : " + grade);

        grade = (char) (grade - 8);
        System.out.println("Your actual grade is : " + grade);

    }

    public void thirdQuestion() {
        System.out.println("Enter you number for third assignment : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10) {
            System.out.println("Number is greater than 10 ");
        } else {
            System.out.println("Number is less than 10 ");
        }
    }

    public void fourthQuestion() {
        int a = (7 * 49 / 7 + 35 / 7);
        System.out.println("Value of 'a' is : " + a);
    }
}

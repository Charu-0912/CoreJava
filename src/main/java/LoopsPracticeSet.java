import java.util.Scanner;

public class LoopsPracticeSet {

    public static void main(String[] args) {

        LoopsPracticeSet loopsPracticeSet = new LoopsPracticeSet();
        loopsPracticeSet.seventhQuestion();

    }

    public void firstQuestion() {

        int n = 4;
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    public void secondQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of first " + num + " even numbers is : " + sum);
    }

    public void thirdQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 0;

        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(num + "*" + i + " = " + mul);
        }
    }

    public void fourthQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 0;

        for (int i = 10; i >= 1; i--) {
            mul = num * i;
            System.out.println(num + "*" + i + " = " + mul);
        }
    }

    public void fifthQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    public void sixthQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;

        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    public void seventhQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            sum += (num * i);

        }
        System.out.println("Addition of multiplication table of " + num + " is : " + sum);
    }


}

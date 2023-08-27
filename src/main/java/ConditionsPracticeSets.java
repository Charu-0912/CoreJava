import java.util.Scanner;

public class ConditionsPracticeSets {

    public static void main(String[] args) {

        ConditionsPracticeSets conditionsPracticeSets = new ConditionsPracticeSets();

        conditionsPracticeSets.fourthQuestion();
    }

    public void firstQuestion() {

        /* int a = 10;
        if (a = 11) {         // We can not use assignment operator in if statements
            System.out.println("I am number 11");
        } else {
            System.out.println("I am not number 11");
        }*/
    }

    public void secondQuestion() {
        int s1, s2, s3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for subject 1 : ");
        s1 = sc.nextInt();

        System.out.println("Enter the marks for subject 2 : ");
        s2 = sc.nextInt();

        System.out.println("Enter the marks for subject 3 : ");
        s3 = sc.nextInt();

        float avg = (s1 + s2 + s3) / 3.0f;

        if (s1 > 33 && s2 > 33 && s3 > 33 && avg >= 40) {
            System.out.println("Congratulations, you are passed the exam !!! \nYour average is : " + avg);
        } else {
            System.out.println("Oops, you are failed in the exam :( \nYour average is : " + avg);
        }

        sc.close();

    }

    public void thirdQuestion() {
        System.out.println("Enter you income : ");

        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        float tax = 0;
        long deduction = 250000;

        if (income >= 250000 && income <= 500000) {
            tax = tax + (income - deduction) * 0.05f;
            System.out.println("You need to pay 5% tax \nYour total tax is " + tax);

        } else if (income > 500000 && income <= 1000000) {
            tax = tax + deduction * 0.05f;
            tax = tax + (income - 500000) * .20f;
            System.out.println("You need to pay 20% tax \nYour total tax is " + tax);

        } else if (income > 1000000) {
            tax = tax + deduction * 0.05f;
            tax = tax + 500000 * .20f;
            tax = tax + (income - 1000000) * .30f;
            System.out.println("You need to pay 30% tax \nYour total tax is " + tax);

        } else {
            System.out.println("Your don't need to pay any tax, enjoy !!!");
        }
    }

    public void fourthQuestion() {
        System.out.println("Enter the year : ");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }
    }
}

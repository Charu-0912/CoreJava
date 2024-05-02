package InterviewQuestions;

public class InterviewQuestions {

    public static void main(String[] args) {

        // 1. Write a Java Program to reverse a String.

        String str = "Automation";
        String reverse = "";

        for (int i=str.length()-1 ; i>=0 ; i--){

            reverse = reverse + str.charAt(i);

        }

        System.out.println(reverse);
    }
}

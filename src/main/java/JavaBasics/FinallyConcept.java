package JavaBasics;

public class FinallyConcept {

    public static void main(String[] args) {

        division();
    }

    public static void test1() {

        try {
            System.out.println("Inside test 1 method");
            throw new RuntimeException("test");
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void test2() {

        try {
            System.out.println("Inside the try block");
            throw new RuntimeException("Test");
        } catch (Exception e) {
            System.out.println("This is exception handling");
        } finally {
            System.out.println("Inside the finally block");
        }
    }

    public static void division() {

        int i = 10;
        try {
            System.out.println("Inside try block");
            int k = 1 / 0;
        } catch (NullPointerException e) {
            System.out.println("Inside catch block");
            String s = e.getMessage();
            System.out.println(s);
        } catch (ArithmeticException e) {
            System.out.println("I am inside 2nd catch block");
        } finally {
            System.out.println("Execute this code even after any exception");
        }
    }

}


/*             Notes:
                   1. 'finally' keyword is always used with try catch block
                   2. After the try catch block whatever we have written inside the 'finally' block will be executed
                   3. This block will be executed irrespective of exception is thrown or not
                   4. 'finally' block can be written only when we are using try block
 */
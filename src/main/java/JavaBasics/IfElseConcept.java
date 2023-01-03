package JavaBasics;

public class IfElseConcept {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int c = 50;
        int d = 60;

        if (b > a) {

            System.out.println("B is greater then A");
        } else {

            System.out.println("A is greater then B");
        }

        if (c==d){

            System.out.println("C and D are equal");
        }else {

            System.out.println("C and D are not equal");
        }

        /* Q : Write a logic to find out the highest number */

        int a1 = 100;
        int b1 = 200;
        int c1 = 500;

       if (a1>b1 & a1>c1){

           System.out.println("A1 is the highest number");
       }else if (b1>c1){

           System.out.println("B1 is the highest number");
       }else {

           System.out.println("C1 is the highest number");
       }

    }
}

/*      Notes:
            1. Comparison operators:
                1. Less than '<'
                2. Greater than '>'
                3. Less than equals '<='
                4. Greater than equals '>='
                5. Equals '=='
                6. Not equals '!='
            2. '=' is a assignment operator which is used to assign values

 */
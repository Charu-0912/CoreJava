package JavaBasics;

public class LoopsConcept {

    public static void main(String[] args) {

        /* While loop */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /* For loop */

        for (int j=1 ; j<=10 ; j++){

            System.out.println("This is for loop output : " + j);

        }


    }
}

/*      Notes:
            1. We are using concept of loop when we are trying to execute the same set of code multiple times
            2. While Loop : It will get executed till the condition is getting false
            3. Disadvantage of while loop is we have to write the increment operator, otherwise it will give you infinite loop
            4. For Loop : To achieve this problem we are using for loop
 */

package JavaBasics;

public class DataTypes {

    public static void main(String[] args) {

        /* Integer */
        int i = 10;
        i = 20;
        int j = 30;
        System.out.println(j);

        /* Double */
        double d = 12.5;
        d = 13.5;
        double A = 100.00;
        double B = 200.5012;
        System.out.println(B);

        /* Character */
        char c = 'a';
        char a = 'b';
        char b = 'x';
        b = 'Y';
        System.out.println(b);

        /* Boolean */
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);

        /* String */
        String s1 = "This is Core Java";
        String s2 = "This is Automation";
        String s3 = "123";
        String s4 = "123.456";
        System.out.println(s1);
    }

/*  Notes :
        1. main() method is staring / execution point of the program
        2. We can not take duplicate variables, but we can change value of variable
        3. In Java, we are having the following data types,
            1. int
            2. double
            3. char
            4. boolean
        - To store numeric values, we are using int data type (only pure integer numbers are allowed it may be +ve / -ve and 0)
        - To store decimal numbers we are using double ()
        - To store characters we are using char data type ()
        - Characters should be the single digit value 'aa' is not allowed
        - boolean can be either True or False
       4. String - Is not a data type, it is a class. But, we can use String to store values
        - String should be written within double quotes "string"
       5. Primitive Data Types : A primitive data type specifies the size and type of variable values, and it has no additional methods

 */
}

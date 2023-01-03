package OOPSPart_1;

public class FunctionsInJava {

    public static void main(String[] args) {

        System.out.println("This is main method");

        /* To call all the methods present we have to create the Objact of calss */

        FunctionsInJava fun = new FunctionsInJava();

        fun.test();

        int a = fun.test2();
        System.out.println(a);

        String str = fun.test3();
        System.out.println(str);

        int b = fun.division(50,5);
        System.out.println(b);

        System.out.println("Static method");
        test4();
    }

    /* Non-Static methods */
    public void test() {

        System.out.println("Test method");       /* No input No Output **/
    }

    public int test2() {

        System.out.println("Test 2 method");    /* No input Some Output **/
        int a = 10;
        int b = 20;
        int c = a + b;

        return c;
    }

    public String test3() {

        System.out.println("Test 3 method");    /* No input Some Output **/

        String s = "Selenium";
        return s;
    }

    public int division(int x, int y){          /* int x and y are arguments **/

        System.out.println("division method");  /* Some input Some Output **/

        int z = x/y;
        return z;
    }

    public static void test4(){

        System.out.println("This is test4 method");
    }

}

/*              Notes:
                    1. Functions and Methods both are the same thing
                    2. void : Means does not return any value
                    3. Main method is void, it will never return any value
 */
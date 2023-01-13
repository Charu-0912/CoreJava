package OOPSPart_1;

public class StaticAndNonStatic {

    String name = "Tom";        //Non static global variable
    static int age = 25;        //Static global variable

    public static void main(String[] args) {

        /* How to call static methods and variables
            1. Direct calling
            2. Calling by classname
        */

        sum();                  //This is a 1st way of calling static methods
        StaticAndNonStatic.sum(); //This is a 2nd way of calling static methods using classname

        System.out.println(age); //This is a 1st way of calling static variables
        System.out.println(StaticAndNonStatic.age); //This is a 2nd way of calling static variables

        /* How to call non-static methods and variables
            1. Create object of a class and call
        */

        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();

        /* Can I access static method by using object reference? : Yes, we can access it */
        obj.sum();      // It will give you a warning, but it is not recommended to use object reference to access static methods

    }

    public void sendMail() {

        System.out.println("This is  : Send Mail method");
    }

    public static void sum() {

        System.out.println("This is : Sum method");
    }
}


/*          Notes:
                1. We can call static methods by two ways
                    a. Direct calling : Call the static method directly
                    b. Using class name : Call the static method by using class name
                2. Scope of global variables will be available across all the functions with some conditions
                3. Conditions : If you are accessing static variables, then we have to use it directly and
                                if we are accessing non-static variable then we have to create object to access that
 */

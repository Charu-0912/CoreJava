package OOPSPart_1;

public class CarClass {

    int mod;
    int wheel; /* These are called class variables */

    public static void main(String[] args) {

        /* new CarClass(); : This is object of car class, new keyword is used to create an object */
        /* new a,b,c : This is called as object reference */
        CarClass a = new CarClass();
        CarClass b = new CarClass();
        CarClass c = new CarClass();

        a.mod = 2015;
        a.wheel = 4;

        b.mod = 2014;
        b.wheel = 4;

        c.mod = 2021;
        c.wheel = 4;

        System.out.println("Before assigning the references");

        System.out.println(a.mod);
        System.out.println(a.wheel);

        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("After shifting the references");

        a = b;
        b = c;
        c = a;

        a.mod = 10;
        System.out.println(a.mod);
        c.mod = 20;
        System.out.println(a.mod);
        System.out.println(c.mod); /* This is called as shifting of object reference */


    }

}

/*          Notes:
                1. Class is an entity where we have to define properties, number of methods and variables
                2. Methods and variables are the characteristics of a class
 */
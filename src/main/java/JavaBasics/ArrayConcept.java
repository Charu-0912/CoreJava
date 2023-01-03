package JavaBasics;

public class ArrayConcept {

    public static void main(String[] args) {

        /* Integer Array */
        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[0]);
        System.out.println(i.length);

        /* Print all the values of array */
        for (int j = 0; j < i.length; j++) {

            System.out.println(i[j]);
        }

        /* Double array */
        double d[] = new double[4];
        d[0] = 12.5;
        d[1] = 13.5;
        d[2] = 14.5;
        d[3] = 15.5;

        System.out.println(d[3]);

        /* Char array */

        char c[] = new char[4];
        c[0] = 'a';
        c[1] = 'e';
        c[2] = 'i';
        c[3] = 'o';

        System.out.println(c[3]);

        /* Boolean array */

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[0]);

        /* String array */

        String s[] = new String[4];
        s[0] = "Google";
        s[1] = "Apple";
        s[2] = "Microsoft";
        s[3] = "Facebook";

        System.out.println(s[0] + s[3]);

        /* Object Array (Object is a class) */

        Object ob[] = new Object[6];
        ob[0] = "Thomas";
        ob[1] = 25;
        ob[2] = 12.33;
        ob[3] = "29/01/1995";
        ob[4] = 'M';
        ob[5] = true;

        for (int k = 0; k < ob.length; k++) {

            System.out.println(ob[k]);
        }

    }
}

/*      Notes:
            1. Arrays are basically used to store similar data types (only int, only chat etc.)
            2. If the size of an array is 'n' then the highest index is 'n-1'
            3. If we are fetching the array member (e.g : i[4]) whose size not exist, then it will throw ArrayIndexOutOfBound exception
            4. 'i.length' will give the size of an array
            5. int i[] = called as one dimensional array
            6. Disadvantage of array : 1. Size is fixed - Which is called as 'Static Array', to overcome this problem we use 'Collections' , ArrayList, HashTable
                                       2. Stores only similar data type values, to overcome this problem we use Object array

 */
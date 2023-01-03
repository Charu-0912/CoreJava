package JavaBasics;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        int i = 1;
        int j = i++;

        System.out.println(i);
        System.out.println(j);

        int a = 10;
        int b = ++a;

        System.out.println(a);
        System.out.println(b);

        int m = 5;
        int n = m--;

        System.out.println(m);
        System.out.println(n);

        int x = 100;
        int y = --x;

        System.out.println(x);
        System.out.println(y);

    }
}


/*
        Notes:
            1. '++' - Increment Operator
            2. '--' - Decrement Operator
            3. 'j = i++' - Post Increment - First value of 'i' will be given to j and then increase value of i
            4. 'j = ++i' - Pre Increment - First increase the value of i, and then it will be given to j
            5. 'j = i--' - Post Decrement -First value of i will be given to j and then decrease value of i
            6. 'j = --i' - Pre Decrement - First decrease the value of i, and then it will be given to j
*/
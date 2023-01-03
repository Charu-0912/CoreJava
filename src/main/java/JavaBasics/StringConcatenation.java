package JavaBasics;

public class StringConcatenation {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        String x = "Hello";
        String y = "World";

        double c = 12.33;
        double d = 10.33;

        System.out.println(a + b);
        System.out.println(x + y);
        System.out.println(a + b + x + y);
        System.out.println(x + y + a + b);

        System.out.println(x + y + (a + b));
        System.out.println(a + b + x + y + a + x + b + y);
        System.out.println(a + b + x + y + a + b);

        System.out.println(c + d);
        System.out.println(x + y + c + d);

        System.out.println("HelloWorld");
        System.out.println("The value of A is : " + a);
        System.out.println("The value of B is : " + b);
        System.out.println("The addition of A and B is : " + (a + b));

        System.out.println("Hello Selenium");
        System.out.print("Hello Testing");
        System.out.print("This is not in the next line");

    }

}

/*     Notes:
        1. Execution will always happen from left to right direction
        2. '+' sign is called as concatenation operator
        3. println - Used to print on the next line in the console
        4. print - Used to print on the same line in the console


 */
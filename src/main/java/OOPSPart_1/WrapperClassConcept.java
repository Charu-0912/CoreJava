package OOPSPart_1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100";
        System.out.println(x+20);

        /* String to integer conversion */
        int i = Integer.parseInt(x);        //Data conversion from String to Integer
        System.out.println(i+20);

        /* String to double conversion */
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+10);

        /* String to boolean */
        String k = "true";
        boolean flag = Boolean.parseBoolean(k);
        System.out.println(flag);

        /* Integer to String */
        int p = 123;
        String str = String.valueOf(p);
        System.out.println(str+200);

        String q = "100A";
        Integer.parseInt(q);

    }
}


/*          Notes:
                1. We are using wrapper classes to convert one data type into the other
                2. We are having the following wrapper classes,
                    1. Integer
                    2. Double
                    3. Boolean
                3. We can not convert String to character
                4. If we want to convert String to int and if the String is not completely int (100A, 200b)
                   then it will throw an exception (NumberformatException), it should be a pure int value
 */
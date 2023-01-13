package JavaBasics;

public class FinalConcept {

    public static void main(String[] args) {

        final int i = 10;
/*      i = 20;  --> We can not change value of the variable as it is declared as final */
    }
}


/*          Notes:
                1. Final keyword is used to define constant values
                2. We can not change the values of the variables when they have defined final
                3. We can make variables, methods and class as final
                4. If we make any class as final then we can not inherit that class
                5. To avoid the inheritance we use final keyword
                6. To avoid method overriding also we are using final keyword

 */
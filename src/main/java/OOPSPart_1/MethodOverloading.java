package OOPSPart_1;

public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.sum();
        obj.sum(2);
        obj.sum(2, 3);
        obj.sum("Method Overloading Concept");

    }

    public void sum() {

        System.out.println("This is sum method with zero arguments");
    }

    public void sum(int a, int b) {

        System.out.println("This is sum method with two arguments");
        System.out.println(a + b);
    }

    public void sum(int c) {

        System.out.println("This is sum method with one argument");
        System.out.println(c);
    }

    public void sum(String str){

        System.out.println(str);
    }

}

/*          Notes:
                1. If a method is having same name, same return type but different arguments within the same class then that
                    method is called overloaded method.
                2. You can not create a method inside a method
                3. Duplicate methods (same method name with same no. of arguments are not allowed)
                4. We can overload main method with the same name but different arguments

 */
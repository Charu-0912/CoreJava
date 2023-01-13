package JavaBasics;

public class A {

    public A() {
        System.out.println("I am a parent class default constructor");
    }

    public A(int a) {

        System.out.println("I am one argument constructor : " + a);
    }

    public A(int a, int b) {

        System.out.println("I am two argument constructor : " + a);
        System.out.println("I am two argument constructor : " + b);
    }

    public void testMethod(){

        System.out.println("I am a test method...");
    }
}

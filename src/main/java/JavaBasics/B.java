package JavaBasics;

public class B {

    public B() {
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {

        B objB = new B();
    }

}


/*          Notes:
                1. Super keyword is used to call parent class constructor
                2. It should be the first statement in constructor
                3. Inside a constructor we can not have two super keywords
                4. If we do not write super keyword then default constructor will be called
                5. If we pass one value in constructor one parameter constructor will be called etc.
                6. Constructor can be overloaded

 */
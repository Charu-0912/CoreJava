package JavaBasics;

public class ConstructorConcept {

    /*public ConstructorConcept() {            //This is default Constructor

        System.out.println("This is default Constructor");
    }*/

    public ConstructorConcept(int a){        //This is single parameter Constructor

        System.out.println("Single param Constructor : " + a);
    }

    public ConstructorConcept(int a, int b){     //This is two parameter Constructor

        System.out.println("Two param constructor : " + a);
        System.out.println("Two param constructor : " + b);

    }

    /* This concept is called as constructor overloading, as we are having same method name but different arguments */

    public static void main(String[] args) {

        ConstructorConcept constructorConcept1 = new ConstructorConcept(10);
        ConstructorConcept constructorConcept2 = new ConstructorConcept(25, 50);

    }
}

/*           Notes:
                1. Constructor means it is a class entity used to define some class features while creating object
                2. Constructor can look like a function but, it is not a function
                3. Constructor can not return any value
                4. Constructor name should be same as class name
                5. Default Constructor : We are not passing any parameters
                6. Single parameter Constructor : Having one argument
                7. Two parameter Constructor : having two arguments
                8. Constructor can be overloaded
                9. Constructor will be called immediately after creating object of that particular class
                   (Default constructor will be called)
                10.If we do not define any constructor then there will be a no argument constructor by default
                11.All parameterize constructors we have to define
 */
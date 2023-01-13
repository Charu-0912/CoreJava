package JavaBasics;

public class ConstructorWithThis {

    //Class variables
    String name;
    int age;

    public ConstructorWithThis(String name, int age) {

        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        ConstructorWithThis constructorWithThis = new ConstructorWithThis("Rajat", 45);
        constructorWithThis.testMethods();

    }

    public void testMethods(){

        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
    }

}

/*          Notes:
                1. Used to initialize the class variables
                2. In above example 'Rajat' is given to the 'name' of constructor but, it will not give to 'name' of class
                   variable. So using 'this' keyword we can initialize class variables in the constructor
                3. this.global variable = local variable
 */

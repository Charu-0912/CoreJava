package OOPSPart_2;

public class TestCar {

    public static void main(String[] args) {

        BMW bmw = new BMW();

        /* Static or Compile time polymorphism */
        bmw.start();        //Here preference was given to the child class, this is called overridden method
        bmw.theftSafety();
        bmw.stop();
        bmw.refuel();
        bmw.engine();       //Child class can inherit methods from grandparents as well

        System.out.println("********************************************************************************************");

        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();

        System.out.println("********************************************************************************************");

        Car car1 = new BMW();  /* Child class object can be referred by parent class reference variable is
                                called Runtime / Dynamic polymorphism, also known as Top Casting */
        car1.start();
        car1.stop();
        car1.refuel();

        System.out.println("********************************************************************************************");

        BMW bmw1 = (BMW) new Car();         //This is called as down casting

    }
}

/*          Notes:
                1. Whenever we are having common methods between child and parent class then preference will be
                   given to child class
                2. When some methods are present in parent class as well as in child class with same name and same
                   number of arguments, then it is called 'Method Overriding'
                3. Compile time polymorphism : At the time of compilation Java will decide which method needs to be called
                4. Run time polymorphism : Child class object can be referred by parent class reference variable
                   is called Runtime / Dynamic polymorphism. Also known as 'Top Casting'
                6. Down casting is possible in Java, it will give classCastException at runtime
                5. Only common methods and parent class methods will be called using dynamic polymorphism
                6. We can not access child class methods (only in child class) by using parent class object ref variable
                7. Parent class can not inherit properties from the child class

 */
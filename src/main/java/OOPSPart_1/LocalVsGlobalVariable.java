package OOPSPart_1;

public class LocalVsGlobalVariable {

    /* These variables are called as global variables or class variables */
    String name = "Tom";
    int age = 25;

    public static void main(String[] args) {

        int i = 10; // This variable is called as local variables
        System.out.println(i);

        LocalVsGlobalVariable variable = new LocalVsGlobalVariable();
        System.out.println(variable.name);
        System.out.println(variable.age);

    }

    public void sum() {

        int i = 15; // This variable is called as local variables
        int j = 20;
        int age = 25;
    }
}

/*          Notes:
                1. Scope of global variable is available throughout the programme
                2. Scope of local variable is restricted to that particular method
                3. To access global variables inside the method, we have to create object of that particular class
 */

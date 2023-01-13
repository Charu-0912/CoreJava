package JavaBasics;

public class FinalizeConcept {

    public static void main(String[] args) {

        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1 = null;
        f2 = null;

        System.gc();
    }

    public void finalize(){
        System.out.println("Finalize Method");
    }
}


/*          Notes:
                1. We can call garbage collector manually using System.gc
                2. Garbage collector will destroy all the objects which does not have any reference
                3. 'finalize' is a method
                4. Before the garbage collector 'finalize' method will be called automatically just for cleanup
                   processing of the object
                5. final is a keyword
                6. finally is a block
                7. finalize is a method

 */
package OOPSPart_2;

public interface USBank {

    int min_bal = 100;

    public void credit();

    public void debit();

    public void transferMoney();

}

/*          Notes:
                1. In interface, we can not give method body, only implementation of methods is allowed
                2. In interface, we can declare the variables and variables are by default static
                3. Variables value will not be change
                4. No static method in interface is allowed
                5. No main method is there in interface
                6. Interfaces are abstract in nature, we can not create object of an interface

 */

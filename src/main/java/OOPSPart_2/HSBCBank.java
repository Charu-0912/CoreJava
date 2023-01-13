package OOPSPart_2;

public class HSBCBank implements USBank, BrazilBank {   /* Here we are achieving multiple inheritance
                                                           this concept can also be called as Is a relationship*/

    @Override
    public void credit() {

        System.out.println("HSBC : Credit method");
    }

    @Override
    public void debit() {

        System.out.println("HSBC : Debit method");
    }

    @Override
    public void transferMoney() {

        System.out.println("HSBC : Transfer money method");
    }

    public void educationLoan(){

        System.out.println("HSBC : Education loan method");
    }

    public void carLoan(){

        System.out.println("HSBC : Car loan");
    }

    @Override
    public void mutualFund() {

        System.out.println("HSBC : Brazil bank mutual funds");
    }
}


/*              Notes:
                    1. We are using implements keyword to implement all the methods from the interface inside a class
                    2. The class in which we are implementing methods from interface, that can have its own methods too
                    3. If a class is implementing any interface, then it is mandatory to define / override all the methods
                       of interface
                    4. We can implement more than two interfaces, by using comma separated and using interfaces name
                    5. In this way we can achieve multiple inheritance
                    6. We can achieve multiple inheritance using interface only
                    7. Has a relationship : When we are inheriting a class (Class to Class)
                    8. Is a relationship : When we are implementing interfaces (Interface to Class)
 */

package OOPSPart_2;

public class TestBank {

    public static void main(String[] args) {

        HSBCBank hsbcBank = new HSBCBank();
        hsbcBank.credit();
        hsbcBank.debit();
        hsbcBank.transferMoney();
        hsbcBank.carLoan();
        hsbcBank.educationLoan();
        hsbcBank.mutualFund();

        /* Dynamic Polymorphism : Child class object can be referred by parent interface ref variable */

        USBank usBank = new HSBCBank();
        usBank.credit();
        usBank.debit();
        usBank.transferMoney();   /* here we can not access education loan method, as it is oly defined by HSBC class
                                    and not by interface */

        System.out.println(USBank.min_bal);
        System.out.println(HSBCBank.min_bal);
//      USBank.min_bal = 500;               /* We can not change the value of any variable from the interface */

        BrazilBank brazilBank = new HSBCBank();
        brazilBank.mutualFund();
    }
}

/*          Notes:
                1. We can not create object of the interface
                2. We can only create object of class
                3. If child class object is referred by parent class object, then only common methods can be called
                4. If we want to access variables defined in the interface then we can access it either by interface name
                   directly or we can access it by class name which implements the interface
                5. All the declaed variables from the interface are by default static and final in nature



 */

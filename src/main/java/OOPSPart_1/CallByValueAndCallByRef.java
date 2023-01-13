package OOPSPart_1;

public class CallByValueAndCallByRef {

    int p;
    int q;

    public static void main(String[] args) {

        CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
        int x = 10;
        int y = 20;
        int z = obj.testSum(x,y); //This is called as call by value or pass by value (Copy of x and y are given as arguments)
        System.out.println(z);

        System.out.println("Before Swapping");      //Before Swapping operation
        obj.p = 50;
        obj.q = 60;
        System.out.println(obj.p);
        System.out.println(obj.q);

        obj.swap(obj);
        System.out.println("After Swapping");       //After swapping operation
        System.out.println(obj.p);
        System.out.println(obj.q);

    }

    public int testSum(int a, int b) {

        int c = a + b;
        return c;
    }

    /* This is called as call by reference and, it is possible in Java */
    public void swap(CallByValueAndCallByRef t){

        int temp;
        temp = t.p;     //temp = 50
        t.p = t.q;      //t.p = 60
        t.q = temp;     //t.q = 50
    }
}

/*          Notes:
                1. We can achieve CallByReference in Java by using object references
 */
package JavaBasics;

public class TwoDimensionalArrayConcept {

    public static void main(String[] args) {

        String s[][] = new String[3][3];
        s[0][0] = "Test1";
        s[0][1] = "Test2";
        s[0][2] = "Test3";

        s[1][0] = "Test4";
        s[1][1] = "Test5";
        s[1][2] = "Test6";

        s[2][0] = "Test7";
        s[2][1] = "Test8";
        s[2][2] = "Test9";

        for (int i=0 ; i<s.length ; i++){

            for (int j=0 ; j<s[0].length ; j++){

                System.out.println(s[i][j]);

            }
        }

    }
}

/*         Notes:
            1. To find total number of rows in 2d array - i.length
            2. To find total number of columns in 2d array - i[0].length
            3. For printing all the values from the 2d array, we have use 2 for loops
 */

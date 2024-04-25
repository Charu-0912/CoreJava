package JAVA_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuestions {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(89);
        list.add(74);
        list.add(52);
        list.add(63);
        list.add(54);
        list.add(58);
        list.add(61);

        //1. Find maximum number from arraylist
        int max = list.get(0);
        for (Integer element : list) {

            if (element > max) {
                max = element;
            }
        }

        System.out.println("Maximum number from the arraylist is : " + max);

        //2. Find minimum number from arraylist

        int min = list.get(0);

        for (Integer elements : list) {

            if (elements < min) {
                min = elements;
            }
        }

        System.out.println("Minimum number from the arraylist is : " + min);

    }
}

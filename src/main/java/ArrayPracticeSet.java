import java.util.Scanner;

public class ArrayPracticeSet {

    public static void main(String[] args) {

        ArrayPracticeSet arrayPracticeSet = new ArrayPracticeSet();
        arrayPracticeSet.eighthQuestion();
    }

    public void firstQuestion() {
        float[] arr = {25.2f, 25.3f, 65.4f, 75.1f, 56.8f};
        float sum = 0;

        for (float i : arr) {
            sum = sum + i;
        }
        System.out.println("Sum of all the elements from array is : " + sum);
    }

    public void secondQuestion() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = false;

        int[] arr = {4, 9, 16, 25, 36, 49, 64, 81, 100};

        for (int i : arr) {

            if (number == i) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Your number is present in the array");
        } else {
            System.out.println("Your number is not present in the array");
        }

    }

    public void thirdQuestion() {

        float[] marks = {45, 74, 85, 87, 72, 65, 71, 72, 84, 63};
        float sum = 0;

        for (float i : marks) {

            sum += i;

        }
        float avg = sum / marks.length;
        System.out.println("Average of the elements of array is : " + avg);
    }

    public void fourthQuestion() {

        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                result[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public void fifthQuestion() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public void sixthQuestion() {
        int[] arr = {45, 52, 53, 4, 56, 21, 23, 87, 41, 9};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number from the given array is : " + max);

    }

    public void seventhQuestion() {
        int[] arr = {45, 52, 53, 14, 56, 21, 23, 87, 41, 9};
        int min = Integer.MAX_VALUE;

        for (int j : arr) {

            if (j < min) {
                min = j;
            }
        }
        System.out.println("Maximum number from the given array is : " + min);

    }

    public void eighthQuestion() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }


}

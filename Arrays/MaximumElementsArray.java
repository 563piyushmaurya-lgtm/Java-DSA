package Array;

import java.util.Scanner;

public class MaximumElementsArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size  : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
      //  int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements");
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("The maximum element is " + max);

        }
    }

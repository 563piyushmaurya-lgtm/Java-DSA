package Array;

import java.util.Scanner;

public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int product = 1;
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the elements : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            product = product * arr[i];
        }
        System.out.println("The product is :" + product);
    }
}

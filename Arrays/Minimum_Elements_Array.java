package Array;

import java.util.Scanner;

public class Minimum_Elements_Array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        int [] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<=n-1;i++){
            System.out.print("Enter the elements :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<=n-1;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum elements is : " + min);
        }

}

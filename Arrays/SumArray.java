package Array;

import java.util.Scanner;

public class SumArray {
static void main() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the array size : ");
  
    int n = sc.nextInt();
    int arraysum = 0;
    int [] arr = new int[n];
  
    for(int i=0;i<n;i++){
        System.out.print("Enter the elements : ");
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        arraysum = arraysum + arr[i];
    }
    System.out.println(" Sum : " + arraysum);
   }
}

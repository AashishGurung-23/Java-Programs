//Problem 01: Binary Search using Java.

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter numbers for the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        boolean found = false;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==key){
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            }
            else if(arr[mid]<key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(!found){
            System.out.println("Number not found");
        }
        sc.close();
    }
}

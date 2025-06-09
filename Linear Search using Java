Problem 02 - Linear Search using Java

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
   
        System.out.println("Enter array data: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Number doesn't exist.");
        }
        sc.close();
    }
}

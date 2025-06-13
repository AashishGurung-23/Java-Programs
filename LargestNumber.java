//Problem 06- Largest of three numbers

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        System.out.println("Enter any three numbers:");
        for(int i=0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=0; i<arr.length; i++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest number:" + max);
        sc.close();
    }
}    

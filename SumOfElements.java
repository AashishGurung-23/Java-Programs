//Problem 08- Sum of all the elements

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter elements(maximum of 5 numbers): ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Given numbers are: " + Arrays.toString(arr));
        System.out.println("Sum of all the numbers: " + sum);
        sc.close();
    }
}

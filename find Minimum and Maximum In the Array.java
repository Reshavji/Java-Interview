//Program to find the minimum (or maximum) element of an array
import java.util.*;

public class Array {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int []arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
        if(arr[i]>=max){
            max = arr[i];
        }
        else if(arr[i]<min){
            min = arr[i];
        }
    }
        System.out.println("Min" +" "+min);
        System.out.println("Max" +" "+max);
    }
}

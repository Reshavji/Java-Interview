//Bubble Sorting O(n)2 time Complexity
import java.util.*;
public class Arays {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int sum: arr){
            System.out.print(sum+" ");
        }
    }
}

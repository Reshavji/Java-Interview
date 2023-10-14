//Reverse the Array
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
            int temp = arr[n-1];
            arr[n-1] =arr[i];
            arr[i] =temp;
            n--;
        }
        for(int sum: arr){
            System.out.print(sum+" ");
        }
    }
}

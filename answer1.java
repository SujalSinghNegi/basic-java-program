// sum the even and odd numbers in a array
import java.util.*;
public class answer1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int evenSum=0, oddSum=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0)evenSum+=arr[i];
            else oddSum+=arr[i];     
           }
        System.out.println("Even sum of the array is "+ evenSum);
        System.out.println("Odd sum of the array is "+ oddSum);

    }
}

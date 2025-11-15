import java.util.*;

public class reverse_arr{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr[i] = value;
        }
        int reversed[] = new int[n];

        for(int i=0;i<n;i++){
            reversed[n-i-1] = arr[i];
        }


        for(int i=0;i<n;i++){
            System.out.print(reversed[i]+" ");
        }
    }
}
import java.util.*;

public class reverse_arr{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        k = k%n;

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr[i] = value;
        }
        

        int temp;

        for(int i=0,j=n-1; i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        int swap;
        for(int i=0,j=k;i<j;i++,j--){
            swap= arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }

        int swap2;
        for(int i=k+1,j=n-1;i<j;i++,j--){
            swap2 = arr[i];
            arr[i] = arr[j];
            arr[j] = swap2;
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
        
    }
}
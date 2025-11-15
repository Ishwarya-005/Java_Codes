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
        Arrays.sort(arr);

        int temp;

        for(int i=n/2, j =n-1 ; i<j; i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ")
        }

        
    }
}
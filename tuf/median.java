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

        if(n%2==0){
            double value = (arr[n/2] + arr[n/2-1]) /2.0;
            System.out.println(value);
        }else{
            System.out.println(arr[n/2]);
        }

        
    }
}
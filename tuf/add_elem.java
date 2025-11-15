import java.util.*;

class meths{

            public static int[] between(int n,int pos,int[] arr,int[] new_arr, int newnum){

            for(int i=0;i<pos;i++){
                new_arr[i] = arr[i];
            }

            new_arr[pos] = newnum;

            for(int i = pos;i<n;i++){
                new_arr[i+1] = arr[i];
            }

            return new_arr;

        }
}

public class add_elem{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();
        int newnum = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr[i] = value;
        }

        int new_arr[] = new int[n+1];
        
        if(pos==0){
            new_arr[0] = newnum;
            for(int i=1;i<n+1;i++){
                new_arr[i] = arr[i-1];
            }
        }else if(pos==n){
            new_arr[n] = newnum;
            for(int i=0;i<n;i++){
                new_arr[i] = arr[i];
            }
        }else{
            new_arr = meths.between(n,pos,arr,new_arr,newnum);
        }

        for(int i=0;i<n+1;i++){
            System.out.print(new_arr[i]+" ");
        } 
    }
}
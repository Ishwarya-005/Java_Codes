import java.util.*;

public class Main{
    public static void main(String[] args){

        int arr[] = {2,356543,-8765,344,0};

        int max = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<max){
                max = arr[i];
            }

        }

        int secLarge = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]<secLarge){
                secLarge = arr[i];
            }
        }
        System.out.println(max+","+secLarge);
        
    }
}
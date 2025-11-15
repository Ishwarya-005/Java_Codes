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

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int map_len = map.size();

        int array[] = new int[map_len];

        for( Integer key : map.keySet){
            int i=0;
            while(i<map_len){
                array[i] = key;
                i++;
            }
        }

        for(int i=0;i<map_len;i++){
            System.out.print(array[i]+" ");
        }

    }
}
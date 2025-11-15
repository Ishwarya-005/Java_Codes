import java.util.*;

public class reverse_arr{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr[i] = value;
        }
        
        for(int i=0;i<n;i++){
            if(counter.containsKey(arr[i])){
                counter.put(arr[i],counter.get(arr[i])+1);
            }else{
                counter.put(arr[i],1);
            }
        }

        for(Integer Key : counter.keySet()){
            System.out.println(Key + ":" + counter.get(Key));
        }
    }
}
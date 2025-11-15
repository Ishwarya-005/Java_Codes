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
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }

        int new_arr[] = new int[list.size()];

        for(int i=0;i<list.size();i++){
            new_arr[i] = list.get(i);
        }

        for(int i=0;i<list.size();i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}
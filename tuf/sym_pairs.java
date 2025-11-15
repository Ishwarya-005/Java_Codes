import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int value = sc.nextInt();
                arr[i][j] = value;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<rows;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.get(second)!=null && map.get(second)==first){
                System.out.println("("+ first + " , "+ second+")");
            }else{
                map.put(first,second);
            }

        }



    }
}
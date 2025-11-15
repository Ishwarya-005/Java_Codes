import java.util.*;

class Meth{

    public void Hello(String x){
    System.out.println("hello "+x+"!");
    }

}

public class oct{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Meth obj = new Meth();
        obj.Hello(name);


    }
}
package two;

import one.Access;

public class Another extends Access{

    public void trial(){
      System.out.println(age);
      //System.out.println(address);
      System.out.println(salary);
      //System.out.println(id);
      
    }
}

class Second{
public static void main(String[] args) {
        Another another = new Another();
        another.trial();  

    }
}
package one;

public class Access{
    public int age;
    private String address;
    protected double salary;
    int id;


}

class Manager extends Access{
    public void trying(){
        System.out.println(age);
        System.out.println(id);
        System.out.println(salary);
        //System.out.println(address);

    }
}


class Grader{
    public static void main(String args[]){

        Manager man = new Manager();
        man.trying();

       
    }
}
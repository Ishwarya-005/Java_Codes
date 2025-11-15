import java.util.Scanner;
import java.util.*;

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    NameNotValidException(String message) {
        super(message);
    }
}

class InvalidStudentDataException extends RuntimeException {
    InvalidStudentDataException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Student{
    int roll;
    int age;
    String course;
    String name;

    public Student(){
      this.roll=0;
      this.age=0;
      this.name="Mary";
      this.course="B.Tech";
    }

    public void validate() throws AgeNotWithinRangeException, NameNotValidException{
      if (age<15 || age>21){
        throw new AgeNotWithinRangeException("Age not valid.");
      }
      if (!name.matches("[a-zA-Z]+")){
        throw new NameNotValidException("Name must be made up of characters only.");
      }
    }



    public Student(int roll, int age, String name, String course){
      this.roll=roll;
      this.age=age;
      this.name=name;
      this.course=course;
      try {
        validate();
      }catch (AgeNotWithinRangeException | NameNotValidException e){
        throw new InvalidStudentDataException("Student data is invalid.",e);
      }
      
}
}

public class one{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    try{
      Student obj = new Student(3005601,48,"Kiran","B.com");
    }catch(InvalidStudentDataException e){
      System.out.println("Cause: " + e.getCause());
      System.out.println(e.getMessage());
    } 
    sc.close();
  }
}
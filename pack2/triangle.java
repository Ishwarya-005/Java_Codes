package pack2;
import pack1.Polygon;

class equiException extends Exception{
  public equiException(String message){
    super(message);
  }
}

class Triangle extends Polygon{
    public void area(int breadth,int height){
      int area = 0.5 * breadth * height;
      System.out.println(area);

    }
}
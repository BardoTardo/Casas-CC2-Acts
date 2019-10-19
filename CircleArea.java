public class CircleArea{
  public static void main(String [] args){
    int radius;
    double pi = 3.1416;
    double area = 0;
  
    for(radius=1; radius<6; radius++){
      area = radius * radius * pi;
      System.out.println("Radius: " + radius + "; Area: " + area);
    }
  }
}
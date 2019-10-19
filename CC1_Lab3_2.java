import java.io.*;

public class CC1_Lab3_2{
  public static void main(String [] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x, y, r, difference;
    r = 0;
    System.out.print("Enter the value for X: ");
    x = Integer.parseInt(br.readLine());
    System.out.print("Enter the value for Y: ");
    y = Integer.parseInt(br.readLine());
    
    difference = x - y;
    
    if(difference < 0){
      r =  x + y;}
    else if (difference == 0){
      r = (2*x) + (2*y);}
    else if (difference > 0){
      r = x * y;}
    
    System.out.println("X: " + x);
    System.out.println("Y: " + y);
    System.out.println("R: " + r);
  }
}
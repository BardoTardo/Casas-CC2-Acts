import java.io.*;
import java.text.DecimalFormat;

public class Room{
  public static void main(String [] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("###,###.00");
    
    double length, width, area;
    
    System.out.print("Enter length: ");
    length = Double.parseDouble(br.readLine());
    System.out.print("Enter width: ");
    width = Double.parseDouble(br.readLine());
    area = length * width;
    
    System.out.print("The floor space of the room is " + df.format(area) + " square units.");
  }
}
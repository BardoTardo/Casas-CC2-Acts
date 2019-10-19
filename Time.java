import java.util.*;

public class Time{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int hr, min, newMin;
    
    System.out.print("Enter number of minutes: ");
    min = sc.nextInt();
    hr = min/60;
    newMin = min%60;
    
    System.out.print(min + " minutes is " + hr + " hours and " + newMin + " minutes.");
  }
}
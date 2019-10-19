import java.lang.Math.*;

public class CC2_Lab5{
  public static void main(String [] args){
    double messageCount = Math.random() * 1000; 
    int typeCast = (int) messageCount;
    double charges = 0;
    System.out.println("You have sent " + typeCast + " messages.");
    
    if(typeCast > 200){
      charges = (typeCast - 200) * 0.5;
      System.out.println("You have incurred " + charges + " PHP in charges.");
    } else 
      System.out.println("You have incurred no charges.");
  }
}
import java.util.*;

public class KamoteSayote{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N, M, K, X, Y;
    
    System.out.print("Enter input: ");
    N = sc.nextInt();
    M = sc.nextInt();
    K = sc.nextInt();
    
    X = N/M;
    Y = (N%M)*K;
    
    if(N >= 1&&M >= 1&&K >= 1&&N <= 1000&&M <= 1000&&K <= 1000){
      System.out.println(X + " kamotes");
      System.out.println(Y + " sayotes");
    } else {
      System.out.println("Invalid input.");
    }
  }
}
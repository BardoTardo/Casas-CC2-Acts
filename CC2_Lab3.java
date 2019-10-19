public class CC2_Lab3{
  public static void main(String [] args){
    char B, A, R, D, E;
    B = 'B'; A = 'A'; R = 'R'; D = 'D'; E = '!';
    int Z, Y, X, W, V;
    Z = B; Y = A; X = R; W = D; V = E;
    System.out.println("B - " + Z);
    System.out.println("A - " + Y);
    System.out.println("R - " + X);
    System.out.println("D - " + W);
    System.out.println("! - " + V);
    int sum, prod, ave, rem;
    sum = Z + Y + X + W + V;
    prod = Z * Y * X * W * V;
    ave = sum/5;
    rem = prod%ave;
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + prod);
    System.out.println("Average " + ave);
    System.out.println("Remainder: " + rem);
  }
}
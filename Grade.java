import java.io.*;

public class Grade{
  public static void main(String [] args) throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    String A = "A";
    String B1 = "B+";
    String B2 = "B";
    String C1 = "C+";
    String C2 = "C";
    String D = "D";
    String F = "F";
    
    System.out.print("Enter your grade: ");
    int grade = Integer.parseInt(br.readLine());
    
    if(grade >= 92 && grade <= 100){
      System.out.println("Grade: " + A);
    } else if(grade >= 87 && grade <= 91){
      System.out.println("Grade: " + B1);
    } else if(grade >= 83 && grade <= 86){
      System.out.println("Grade: " + B2);
    } else if(grade >= 79 && grade <= 82){
      System.out.println("Grade: " + C1);
    } else if(grade >= 75 && grade <= 78){
      System.out.println("Grade: " + C2);
    } else if(grade >= 70 && grade <= 74){
      System.out.println("Grade: " + D);
    } else if(grade < 70){
      System.out.println("Grade: " + F);
    } else{
      System.out.println("Invalid Input");
    }
  }
}
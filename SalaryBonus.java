import java.io.*;

public class SalaryBonus{
  public static void main(String [] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    double salary = 0;
    double bonus = 0;
    System.out.print("Employee Name: ");
    name = br.readLine();
    System.out.print("Salary: ");
    salary = Double.parseDouble(br.readLine());
    
    if (salary < 1000)
      bonus = 0.5 * salary;
    else
      bonus = 1000;
    
    System.out.println("Employee Name: " + name + "\nBonus Salary: " + bonus);
  }
}
import java.io.*;

public class CC2_Lab4{
  public static void main(String [] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String name;
    int age = 0;
    System.out.print("Enter the child's name: ");
    name = br.readLine();
    System.out.print("Enter the age: ");
    age = Integer.parseInt(br.readLine());
    System.out.print("Pets: ");
    
    if(name.equals("Jhim")||name.equals("Ethan")){
      if(age>4 && age <11)
        System.out.println("Hamster, Dog");
      else if(age>10 && age <16)
        System.out.println("Spider, Dog");
      else if(age>15 && age <21)
        System.out.println("Dog, Snake");
      else if(age>20)
        System.out.println("No Pets, Not Interested");
    } else if (name.equals("Sally")||name.equals("Joy")){
      if(age>4 && age <11)
        System.out.println("Hamster, Cat");
      else if(age>10 && age <16)
        System.out.println("Car, Rabbit");
      else if(age>15 && age <21)
        System.out.println("Cat");
      else if(age>20)
        System.out.println("No Pets, Not Interested");
    }
  }
}
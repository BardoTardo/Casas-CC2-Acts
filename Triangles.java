import java.io .*;

public class Triangles{
    public static void main(String[]args){
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int prev = 0, next = 1, ans = 0;
        int i, num = 0;
        String input = " ";
        
        System.out.print("Enter Triangle Height: ");
        try{
            input = in.readLine();
        }catch (IOException e){
            System.out.println("Invalid Input!");
        }    
        num = Integer.parseInt(input);
        System.out.println(num);
        
        for(i= num; i>=0; i--){
                System.out.print(ans + "_");
                prev = next;
                next = ans;
                ans = prev + next;
       }   
   }
}
           
                    
        
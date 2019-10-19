import javax.swing.*;

public class LuckyTrees{
    public static void main(String[]args){
        int branches;
        
        do{
            String in = JOptionPane.showInputDialog("Enter input: ");
            branches = Integer.parseInt(in);
            if (branches==0){
                System.out.println(branches + "\t-END-");
            }else if (branches%3==0 && branches%7==0){
                System.out.println(branches + "\tLUCKY");
            }else if (branches/10<1){
                System.out.println(branches + "\tNORMAL");
            }else if (branches>5000){
                System.out.println("Invalid input.");     
            }else{
                System.out.println(branches + "\tNORMAL");
            }   
        }while(branches!=0);   
    }
}        
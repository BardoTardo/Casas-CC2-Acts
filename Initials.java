import javax.swing.*;
public class Initials{
  public static void main(String [] args){
    String firstInitial, middleInitial, lastInitial;
    firstInitial = JOptionPane.showInputDialog(null, "Enter your first name's initial: ");
    middleInitial = JOptionPane.showInputDialog(null, "Enter your middle name's initial: ");
    lastInitial = JOptionPane.showInputDialog(null, "Enter your last name's initial: ");
    
    JOptionPane.showMessageDialog(null, firstInitial.charAt(0) + "." + middleInitial.charAt(0) + "."+ lastInitial.charAt(0) + ".");   
  }
}
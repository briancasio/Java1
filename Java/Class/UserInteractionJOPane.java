import javax.swing.JOptionPane;

public class UserInteractionJOPane {
  public static void main (String[] args){
  
    String food = JOptionPane.showInputDialog("What is your favorite food");

    JOptionPane.showMessageDialog(null, "Your favorite food is " + food);

  }  
}
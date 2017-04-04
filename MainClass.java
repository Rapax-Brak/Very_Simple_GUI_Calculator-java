import javax.swing.JOptionPane;

public class MainClass {
	public static void main(String[] args) {
		String FirstNumber = JOptionPane.showInputDialog("Enter first number"); 
		String SecondNumber = JOptionPane.showInputDialog("Enter second number"); 
		
		int num1 = Integer.parseInt(FirstNumber);
		int num2 = Integer.parseInt(SecondNumber);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The sum is " +sum, "Simple Calculator", JOptionPane.PLAIN_MESSAGE);
	}	
}


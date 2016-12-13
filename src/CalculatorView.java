import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorView extends JFrame {
	
	private JTextField fristNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		//Sets up the View and add the components
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(fristNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFristNumber(){
		return Integer.parseInt(fristNumber.getText()); //return Value from TextField[fristNumber]		
	}
	
	public int getSecdNumber(){
		return Integer.parseInt(secondNumber.getText()); //return Value from TextField[secondNumber]		
	}
	
	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText()); //return Value from TextField[Calcsolution]
	}
	
	public void setCalcSolution(int solution){
		calcSolution.setText(Integer.toString(solution));
	}
	
	//Event Click calculateButton
	void addCalculateListener(ActionListener listenForCalcButton){
		calculateButton.addActionListener(listenForCalcButton);		
	}
	
	void displayErrorMessage(String ErrorMessage){
		JOptionPane.showMessageDialog(this, ErrorMessage);
	}
	
	

}

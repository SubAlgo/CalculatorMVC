import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int fristNumber, secondNumber = 0;
			
			try{
				fristNumber = theView.getFristNumber();
				secondNumber = theView.getSecdNumber();
				
				theModel.addTwoNumbers(fristNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex){
				System.out.println(ex);
				theView.displayErrorMessage("You need to enter 2 Integer");
			}
		}
	}
}

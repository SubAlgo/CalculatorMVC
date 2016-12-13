
public class CalculatorModel {

	private int calculationValue;
	
	public void addTwoNumbers(int fristNumber, int secondNumber){
		calculationValue = fristNumber + secondNumber;
	}
	
	public int getCalculationValue(){
		return calculationValue;
	}

}

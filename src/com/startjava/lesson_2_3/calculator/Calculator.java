public class Calculator{

	private	int num01;
	private	int num02;
	private	String mathOperation;

	public void setNum01(int num01){
		this.num01 = num01;
	}

	public int getNum01(){
		return num01;
	}

	public void setNum02(int num02){
		this.num02 = num02;
	}

	public int getNum02(){
		return num02;
	}

	public void setMathOperation(String mathOperation){
		this.mathOperation = mathOperation;
	}

	public String getMathOperation(){
		return mathOperation;
	}

	public void mathOperation(int num01, int num02, String mathOperation){
		switch (mathOperation) {
			case "+":
				System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
				break;
			case "-":
				System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
				break;
			case "*":
				System.out.println(num01 + " * " + num02 + " = " + (num01 * num02));
				break;
			case "/":
				System.out.println(num01 + " / " + num02 + " = " + (num01 / num02));
				break;
			case "%":
				System.out.println(num01 + " % " + num02 + " = " + (num01 % num02));
				break;
			case "^":
				System.out.println(num01 + " ^ " + num02 + " = " + (int) Math.pow(num01, num02));
				break;
			default:
				System.out.println("Incorrect operation!");				
		}				
	}	

}
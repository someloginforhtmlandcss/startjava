public class Calculator{

	public static void main(String[] args){

		int num01 = 0;
		int num02 = 3000;

		char operation = '^';

		if (operation == '+'){
			System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));			
		} else if (operation == '-'){
			System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));		
		} else if (operation == '*'){
			System.out.println(num01 + " * " + num02 + " = " + (num01 * num02));		
		} else if (operation == '/'){
			System.out.println(num01 + " / " + num02 + " = " + (num01 / num02));	
		} else if (operation == '%'){
			System.out.println(num01 + " % " + num02 + " = " + (num01 % num02));	
		} else if (operation == '^'){
			if (num01 == 0 & num02 == 0){
				System.out.println("Operation is senseless!");
			} else if (num01 > 0 & num02 == 0){
				System.out.println(num01 + " ^ " + num02 + " = " + 1);
			} else if (num02 == 1){
				System.out.println(num01 + " ^ " + num02 + " = " + num01);
			} else if (num02 > 1){
				int result = 0;
				for (int i = 1; i < num02; i++){
					if (i == 1){
						result = num01 * num01;
					}
					else {
						result = result * num01;
					}
				}
				System.out.println(num01 + " ^ " + num02 + " = " + result);	
			}
		} 
	}
}
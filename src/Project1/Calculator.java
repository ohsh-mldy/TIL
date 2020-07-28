package Project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("연산식을 입력해주세요.");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			
			int operand1 = Integer.parseInt(str.substring(0, 1));	// 첫 번째 피연산자
			int operand2 = Integer.parseInt(str.substring(2));		// 두 번째 피연산자
			String operator = str.substring(1, 2);		// 연산자
			double result = 0;
			
			switch(operator) {
				case "+":
					result = (double) operand1 + operand2;
				break;
					
				case "-":
					result = (double) operand1 - operand2;
				break;
				
				case "*":
					result = (double) operand1 * operand2;
				break;
				
				case "/":
					result = (double) operand1 / operand2;
				break;
			}
			
			DecimalFormat df = new DecimalFormat("#.###"); 
			System.out.println(str + " = " + df.format(result));
		}
		
	}

}

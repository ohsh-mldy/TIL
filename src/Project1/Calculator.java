package Project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("������� �Է����ּ���.");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			
			int operand1 = Integer.parseInt(str.substring(0, 1));	// ù ��° �ǿ�����
			int operand2 = Integer.parseInt(str.substring(2));		// �� ��° �ǿ�����
			String operator = str.substring(1, 2);		// ������
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

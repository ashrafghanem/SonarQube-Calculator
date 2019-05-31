package najah.edu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Calculator {
	private double num1;
	private double num2;
	private char operation;
	private double res;

	public Calculator(double a, double b, char op) {
		num1 = a;
		num2 = b;
		operation = op;
	}

	public void calc() {
		switch (operation) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		default:
			res = 0.0;
		}
		displayResult();
	}

	public void displayResult() {
		Logger logger = Logger.getLogger("test");
		String result = ((Double)res).toString();
		logger.log(Level.FINE, result);
	}
}

public class Main {

	private Main() {

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		char op = in.next().toCharArray()[0];
		Calculator calculator = new Calculator(a, b, op);
		calculator.calc();
		in.close();
	}
}

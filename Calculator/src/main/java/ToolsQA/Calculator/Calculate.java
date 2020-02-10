package ToolsQA.Calculator;
import java.util.*;

public class Calculate {
	private int op1,op2,result;
	private char operation;
	Scanner input=new Scanner(System.in);
	public void readOperand() {
		System.out.println("Enter the values of Operands a and b");
		setOperand1(input.nextInt());
		setOperand2(input.nextInt());
	}
	public void readOperator()
	{
		System.out.println("Enter the Operation to be performed");
		System.out.println("Addition: +");
		System.out.println("Subtraction: -");
		System.out.println("Multiplication: *");
		System.out.println("Division: /");
		setOperation(input.next().charAt(0));
	}
	public void Operation()
	{
		String possibleOperations="+-/*";
		if(possibleOperations.contains(Character.toString(this.getOperation())))
		{
			if(this.getOperation()=='+')
			{
				ArithmeticOperations arithmeticoperations=new ADD();
				arithmeticoperations.action(this.getOperand1(),this.getOperand2());
				this.setResult(arithmeticoperations.result);
			}
			else if(this.getOperation()=='-')
			{
				ArithmeticOperations arithmeticoperations=new SUB();
				arithmeticoperations.action(this.getOperand1(),this.getOperand2());
				this.setResult(arithmeticoperations.result);
			}
			else if(this.getOperation()=='*')
			{
				ArithmeticOperations arithmeticoperations=new MUL();
				arithmeticoperations.action(this.getOperand1(),this.getOperand2());
				this.setResult(arithmeticoperations.result);
			}
			else {
				ArithmeticOperations arithmeticoperations=new DIV();
				arithmeticoperations.action(this.getOperand1(),this.getOperand2());
				this.setResult(arithmeticoperations.result);
			}
		}
		else {
			System.out.println("Invalid Operation");
			return;
		}
	}
	public void printResult() {
		if(this.getOperation()=='*'|this.getOperation()=='-'|this.getOperation()=='+'|this.getOperation()=='/')
		System.out.println(this.op1+" "+this.operation+" "+this.op2+" = "+this.result);
	}
	public int getOperand1() {
		return op1;
	}
	public void setOperand1(int op1) {
		this.op1 = op1;
	}
	public int getOperand2() {
		return op2;
	}
	public void setOperand2(int op2) {
		this.op2= op2;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
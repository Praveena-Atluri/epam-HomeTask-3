package ToolsQA.Calculator;
import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        System.out.println( "Calculator Application" );
        char check;
        do {
        Calculate calculator = new Calculate();
        calculator.readOperand();
        calculator.readOperator();
        calculator.Operation();
        calculator.printResult();
        System.out.println("Press Y to continue (Y/N)");
        check= input.next().charAt(0); 
        }while(Character.toLowerCase(check)=='y');
        System.out.println( "ThankYou :)");
    }
}
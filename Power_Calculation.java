import java.util.*;
public class Power_Calculation{
	public static void main(String [] args){
		double base, exponent, results;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base value:");
		base=sc.nextDouble();
		System.out.println("enter the exponent value:");
		exponent=sc.nextDouble();
		results= Math.pow(base,exponent);
		int roundedValueOfBase= (int) Math.round(base);
		int roundedValueOfExponent= (int) Math.round(exponent);
		int roundedValueOfresults = (int) Math.round(results);
	System.out.println("The answer of "+ roundedValueOfBase + " with power of "+roundedValueOfExponent+ " is " + roundedValueOfresults );
	}
}
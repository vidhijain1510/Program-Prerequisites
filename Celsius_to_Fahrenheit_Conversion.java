import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion{
	public static void main(String[] args){
		int Celsius,fahrenheit;
		Scanner sc= new Scanner(System.in);
		Celsius=sc.nextInt();
		fahrenheit = (Celsius * 9/5)+32;
	System.out.println(fahrenheit);
	}
}

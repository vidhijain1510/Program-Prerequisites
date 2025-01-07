import java.util.Scanner;
public class Area_of_a_Circle{
	public static void main(String [] args){
		int radius,area;
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		area= 22/7 * radius *radius;
	System.out.println(area);
	}
}
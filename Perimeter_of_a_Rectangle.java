import java.util.*;
public class Perimeter_of_a_Rectangle{
	public static void main(String [] args){
		int perimeter, length, width;
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		width=sc.nextInt();
		perimeter= 2* (length + width);
	System.out.println(perimeter);
	}
}
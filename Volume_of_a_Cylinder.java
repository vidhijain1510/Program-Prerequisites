import java.util.Scanner;
public class Volume_of_a_Cylinder{
	public static void main(String [] args){
		int radius,height,volume;
		Scanner sc= new Scanner(System.in);
		radius=sc.nextInt();
		height=sc.nextInt();
		volume= 22/7 * radius *radius *height;
	System.out.println(volume);
	}
}
	
import java.util.Scanner;
public class Calculate_Simple_Interest{
	public static void main(String[] args){
		int simpleinterest, principle, rate, time;
		Scanner sc=new Scanner(System.in);
		principle=sc.nextInt();
		rate=sc.nextInt();
		time=sc.nextInt();
		simpleinterest=(principle * rate * time)/100;
	System.out.println(simpleinterest);
	}
}
import java.util.Scanner;

public class Biggest {

	public static void main(String[] arg) {
		System.out.println("enter the integers");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a>b && a>c)
			System.out.println("print the greater number"+a);
		else if(b>a && b>c)
			System.out.println("print the greater number"+b);
		else if(c>a && c>a)
			System.out.println("print the greater number"+c);
		else
			System.out.println("entered number are not distinct");
			
		// TODO Auto-generated constructor stub
	}

}

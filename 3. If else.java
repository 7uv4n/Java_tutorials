import java.util.Scanner;

public class Thrid_if_else {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter 1st no:");
		a=a1.nextInt();
		System.out.println("Enter 2nd no:");
		b=a1.nextInt();
		System.out.println("Enter 3rd no:");
		c=a1.nextInt();
		if(a>c)
			d=a;
		else if(b>c)
			d=b;
		else
			d=c;
		System.out.println(d+" is greatest");
		
	}
}

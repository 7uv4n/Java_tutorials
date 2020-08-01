import java.util.Scanner;

public class Fourth_dowhile {

    public static void main(String[] args) {

    	//We will find the factorial of this number
		int a;
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter a no:");
		a=a1.nextInt();
        long fact = 1;
        int i = 1;
        do
        {
            fact = fact * i;
            i++;
        }while(i<=a);
        System.out.println("Factorial of "+a+" is: "+fact);
    }
}

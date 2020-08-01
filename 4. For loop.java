import java.util.Scanner;

public class Fourth_forloop {

    public static void main(String[] args) {

    	//We will find the factorial of this number
		int number;
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter a no:");
		number=a1.nextInt();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

}

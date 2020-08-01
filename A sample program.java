import java.util.*;
public class Main
{
        public static void main(String []args){
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the no.of Students : ");
        int n = ns.nextInt();
          for(int i=0;i<n;i++){
           Scanner s = new Scanner(System.in);
            System.out.println("Enter the Student name : ");
           String name = s.nextLine();
           System.out.println("Entering the marks");
           System.out.println("Enter the marks for AI: ");
           int a = s.nextInt();  
          System.out.println("Enter the marks for ML: ");
         int m = s.nextInt();  
         System.out.println("Enter the marks for Python: ");
         int p = s.nextInt();  
         System.out.println("Displaying the marks");
         System.out.println("AI:"+ a);
         System.out.println("ML:"+ m);
         System.out.println("Python:"+ p);
        
        }
	}
}

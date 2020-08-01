class mainclass{  
	void main1(){
		System.out.println("Main class Function here");
		}  
	}  

class subclass1 extends mainclass{  
	void sub1(){
		System.out.println("Sub class-1 Function here");
		}  
	}

class subclass2 extends mainclass{  
	void sub2(){
		System.out.println("Sub class-2 Function here");
		}  
	}

class finalsubclass extends subclass1,subclass2{
	void final1{
		System.out.println("Final Sub class Function here");		
	}
}
public class Second_Hybrid {

	
	public static void main(String[] args){  
			subclass1 d=new subclass1();
			subclass2 e=new subclass2();  
			System.out.println("First Subclass");
			d.main1();  
			d.sub1();  
			System.out.println("\nSecond Subclass");
			e.main1();
			e.sub2();  
		}
}

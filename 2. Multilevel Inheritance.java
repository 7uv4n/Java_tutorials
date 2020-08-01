import java.io.*;

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

class subclass2 extends subclass1{  
	void sub2(){
		System.out.println("Sub class-2 Function here");
		}  
	}

public class Second_Multilevel {
	
	public static void main(String[] args){  
			subclass2 d=new subclass2();  
			d.main1();  
			d.sub1();  
			d.sub2();  
		}
	}  




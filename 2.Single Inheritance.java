import java.io.*;

class mainclass{  
	void main1(){
		System.out.println("Main class Function here");
		}  
	}  

class subclass extends mainclass{  
	void sub1(){
		System.out.println("Sub class Function here");
		}  
	}

public class Second_Single { 
	
	public static void main(String[] args){  
			subclass d=new subclass();  
			d.main1();  
			d.sub1();  
		}
	}  

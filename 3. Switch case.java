import java.util.Scanner;

public class Third_switch {

public static void main(String[] args)
		{
		int a;
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter a no from 1-4:");
		a=a1.nextInt();
		String musicInstrument;
		// switch statement with int data type
		switch (a) {
		case 1:
		musicInstrument = "Guitar";
		break;
		case 2:
		musicInstrument = "Piano";
		break;
		case 3:
		musicInstrument = "Drums";
		break;
		case 4:
		musicInstrument = "Flute";
		break;
		default:
		musicInstrument = "Invalid";
		break;
		}
		System.out.println("Music Instrument:"+musicInstrument);
		}
}

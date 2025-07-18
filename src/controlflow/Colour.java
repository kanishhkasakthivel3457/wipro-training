package controlflow;
import java.util.Scanner;
public class Colour {
	public String checkcolour(char ch) {
		switch(ch) {
		case 'R':
			return "Red";
		case 'B':
			return "Blue";
		case 'G':
			return "Green";
		case 'O':
			return "Orange";
		case 'Y':
			return "Yellow";
		case 'W':
			return "White";
		default:
			return "Invalid";
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		Colour obj = new Colour();
		String str=obj.checkcolour(ch1);
		System.out.println(str);
	}

}



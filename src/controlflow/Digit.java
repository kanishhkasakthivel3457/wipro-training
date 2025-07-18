package controlflow;
import java.util.Scanner;
public class Digit {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	
		int sum=0;
		while(n!=0) {
			int x=n%10;
			sum+=x;
			n=n/10;
		}

	
		}
	}



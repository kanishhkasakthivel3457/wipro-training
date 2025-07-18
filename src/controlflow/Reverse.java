package controlflow;
import java.util.Scanner;
public class Reverse {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String rev="";
		while(a!=0) {
			int b=a%10;
			rev=rev+b;
			a=a/10;
		}
		System.out.print(rev);
	}


	}



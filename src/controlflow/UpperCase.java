package controlflow;
import java.util.Scanner;
public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		if(Character.isLowerCase(ch1)) {
			System.out.println(ch1+"->"+Character.toUpperCase(ch1));
		}
		else if(Character.isUpperCase(ch1)) {
			System.out.println(ch1+" -> "+Character.toLowerCase(ch1));
		}


	}

}

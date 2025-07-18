package controlflow;
import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the input value");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("the given number is"+num+ "even number");
		}
		else {
			System.out.print("the given number is"+num+ "odd number");    
		}
	}
                
}

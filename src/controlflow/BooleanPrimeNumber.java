package controlflow;
import java.util.Scanner;
public class BooleanPrimeNumber {
	
		public static Boolean isPrime(int n) {
			if(n<=1) {
				return false;
			}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			boolean n=isPrime(num);
			if(n) {
			System.out.println(num+" is a Prime Number");
			}
			else {
				System.out.println(num+" is not a Prime Number");
			}
		}

	

	}


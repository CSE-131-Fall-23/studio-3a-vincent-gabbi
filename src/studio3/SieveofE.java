package studio3;
import java.util.Arrays;
import java.util.Scanner;
public class SieveofE {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is the max value?");
		int max = in.nextInt();
		boolean [] prime = new boolean [max];
		Arrays.fill(prime, true);
		for(int i =2; i<max; i++) {
			for(int x=2; x*i<max; x++) {
				prime[x*i] = false;
			}
			if(prime[i]== true) {
				System.out.println(i);
			}
		}
		}
		
		

	}


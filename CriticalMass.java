import java.io.*;
import java.util.Scanner;

public class CriticalMass {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int read,count;
		while((read = Integer.parseInt(scanner.nextLine())) != 0 ){
			count = 0;
			for (int i = Math.pow(2,read-1); i < Math.pow(read,2); i++){
			//System.out.println(Integer.toBinaryString(i));
			String stack = Integer.toBinaryString(i);
			count += ((stack.contains("111") || stack.contains("000")))? 1:0;
			System.out.println(stack + " : " + count );
			}
			System.out.println(count);
		}
	}
}

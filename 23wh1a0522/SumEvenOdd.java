package javapractise;
import java.util.*;

public class SumEvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = scanner.nextInt();
		int Numbers[] = new int[size];
		for(int i=0;i<size;i++) {
			Numbers[i] = scanner.nextInt();
		}
		int even_sum = 0;
		int odd_sum = 0;
		for(int num: Numbers) {
			if(num%2==0) {
				even_sum += num;
			}
			else {
				odd_sum += num;
			}
		}
		System.out.printf("Sum of even numbers: %d",even_sum);
		System.out.printf("Sum of odd numbers: %d",odd_sum);
	}
}

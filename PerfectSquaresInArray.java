import java.lang.*;
import java.util.Scanner;
class PerfectSquaresInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = sc.nextInt();
		int i;
		int[] numbers = new int[size];
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++){
			numbers[i] = sc.nextInt();
		}
		System.out.println("Perfect squares in the array are:");
		for(i=0;i<size;i++){
			double val = Math.sqrt(numbers[i]);
			if((int)val*(int)val == numbers[i]){
				System.out.println(numbers[i]);
			}
		}
	}
}
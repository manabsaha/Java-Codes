/*SELECTION SORT*/
import java.util.Scanner;
class SelectionSort{
	int minimum;
	int temp;
	int i,j;
	void sort(int[] arr,int size){
		for(i =0;i<size-1;i++){
			minimum = i;
			for(j =1+i;j<size;j++){
				if(arr[j]<arr[minimum]){
					minimum=j;
				}
			}
			temp = arr[i];
			arr[i]= arr[minimum];
			arr[minimum] = temp;
		}
		System.out.println("Sorted array is: ");
		for(i = 0;i<size;i++)
			System.out.println(arr[i]);
		
	}
		void sortAfterIterationsNumber(int[] arr,int size,int iterations){
		for(i =0;i<iterations;i++){
			minimum = i;
			for(j =1+i;j<size;j++){
				if(arr[j]<arr[minimum]){
					minimum=j;
				}
			}
			temp = arr[i];
			arr[i]= arr[minimum];
			arr[minimum] = temp;
			
		}
		System.out.println("Array after "+iterations+" iterations is :");
		for(i = 0;i<size;i++)
			    System.out.print(arr[i]+" ");
	}
}
public class SelectionSortMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		SelectionSort obj = new SelectionSort();
		obj.sort(arr,size);
		System.out.print("Enter number of iterations to be performed: ");
		int iterations = sc.nextInt();
		obj.sortAfterIterationsNumber(arr,size,iterations);
	}
}
/*INSERTION SORT*/
import java.util.Scanner;
class InsertionSort{
	
	void sort(int[] arr, int size){
		int i,temp,j;
		for(i=0;i<size;i++){
			temp = arr[i];
			j=i;
			while(j>0 && temp<arr[j-1]){
				arr[j] = arr[j-1];
				j-=1;
			}
			arr[j]=temp;
		}
		System.out.println("Sorted array is: ");                                                               
		for(i=0;i<size;i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++){
			array[i] = sc.nextInt();
		}
		InsertionSort obj = new InsertionSort();
		obj.sort(array,size);
	}
}
		
	
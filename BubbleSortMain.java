/*BUBBLE SORT*/
import java.util.Scanner;
class BubbleSort{
    int temp,count =0;
    int bubbleSort(int[] array , int size){
        for(int i=0;i<size-1;i++){
            for(int j =0;j<size-1-i;j++){
                if(array[j]>array[j+1]){
                    ++count;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
		System.out.println("Sorted array is: ");
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
        return count;
    }
}
public class BubbleSortMain {
    public static void main(String args[] ) throws Exception {
           Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the size of array: ");
           int size = sc.nextInt();
           int[] arr = new int[size];
		   System.out.println("Enter the elements in array: ");
           for(int i=0;i<size;i++){
               arr[i] = sc.nextInt();
           }
           BubbleSort obj = new BubbleSort();
           System.out.println("Number of passes: " + obj.bubbleSort(arr,size));
    }
}
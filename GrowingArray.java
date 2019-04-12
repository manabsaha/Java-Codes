import java.util.*;
class GrowingArray{
	public static void main(String[] args){
	System.out.println("Java Program: Grows the size of the INTEGER ARRAY by TWICE (in runtime).\n-------->To stop storing, enter q or any non-integer input");
	Scanner sc = new Scanner(System.in);
	int[] nums = new int[5];
	int i=0,size=5;
	System.out.println("Initial size: " + size + "\n");
	String input;
	while(true){
		if(i==size){
			System.out.println(size+" elements stored in array.\n");
			System.out.println("Growing the size of the array........");
			int[] nums2 = new int[size];
			for(int j=0;j<size;j++) nums2[j] = nums[j];
			nums = null;
			size = 2*size;
			nums = new int[size];
			for(int j=0;j<size/2;j++) nums[j] = nums2[j];
			nums2 = null;
		}
		input = sc.next();
		try{
			nums[i] = Integer.parseInt(input);
			++i;
		}	
		catch(NumberFormatException e){
			System.out.println(i+" elements stored in array.\n");
			break;
		}
	}
	System.out.println("Your desired array of " + i + " elements:");
	for(int j=0;j<i;j++)	System.out.println(nums[j]);
	}
}
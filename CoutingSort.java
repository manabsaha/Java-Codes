import java.util.Scanner;
class CountingSort {
    void countingSort(int[] arr,int size){
        int i,max = arr[0];
        int[] sortedArr = new int[size];
        for(i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] aux = new int[max+1];
        for(i=0;i<aux.length;i++){
            aux[i]=0;
        }
        for(i=0;i<size;i++){
            aux[arr[i]]+=1;
        }
        int j=0;
        for(i=0;i<aux.length;i++){
            if(aux[i]!=0){
                sortedArr[j]=i;
                ++j;
            }
        }
        System.out.println("Sorted Array: ");
        for(i=0;i<j;i++){
          System.out.print(sortedArr[i]+" ");
        }
        System.out.println("\nNumber of occurences: ");
        for(i=0;i<j;i++){
            System.out.println(sortedArr[i]+" "+aux[sortedArr[i]]);
        }
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        CountingSort obj = new CountingSort();
        obj.countingSort(arr,size);

    }
}

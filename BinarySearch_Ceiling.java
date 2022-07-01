import java.util.Scanner;

public class BinarySearch_Ceiling {
    //cieling is the the number in the array that is searched for it displays next number
    //for example {10,20,30,35,40,45}
    // now target element = 30 it will return index=2
    // if element =32 it will return 35
   static int binarySearch(int [] arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(target > arr[mid]){
            start=mid+1;
        }
        else if(target < arr[mid]){
            end=mid-1;
        }
        else{
            return mid;
        }
    }
    //return -1;  here we are returning start because if value is not present in array it will display its next number
    return start;   //here we are returning next element to middle element if its not found in array
    //return end;  here we are returning floor of number
   }
   public static void main(String[] args) {
    System.out.println("Please enter array");
    Scanner sc=new Scanner(System.in);
    int varr[] = new int [5];
    for(int i=0;i<=varr.length-1;i++){
        varr[i]=sc.nextInt();
    }
    System.out.println("Please enter target");
   int target = sc.nextInt();
    System.out.println("Please enter value to search");
    int result=binarySearch(varr, target);

    System.out.println("so the index of array is"+result);

   }

}

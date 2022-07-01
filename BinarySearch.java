import java.util.Scanner;

public class BinarySearch {
 static int binarySearch(int[] arr,int target){
    int start=0;
    int end=arr.length;
   
    while(start<=end){
        int mid=start+(end-start)/2; //if we right start+end/2 integer has fixed size 
                                    // if we take large value of start or end it may exceed interger value
                                    // so we are using mid=start+(end-start)/2
        if(target<arr[mid]){   // here we used arr[mid] to compare value not index
            end=mid-1;
        }else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
    
      
                                }
    return -1;
                                
  
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr = new int[8];
    System.out.println("Please enter value of array");
    for(int i=0;i<arr.length-1;i++){
        arr[i]=sc.nextInt();
    }
   int ans=binarySearch(arr,5);
   System.out.println(+ans);
  }
}

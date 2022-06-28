import java.util.*;
class InsertionSort{
    public static void main(String[] args) {
        int a[]= new int[5];
        int temp;
        System.out.println("Please enter array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("This is your array before sorting");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
//phela step ye hai ki insertion sort mai ham array ko sorted or unsorted mai divide kerte hai
//loop will start from 1 to a.length-1

        for(int i=1;i<a.length-1;i++){
            temp=a[i];  //isme ham array k second index ki value store ker rahe hai
            int j=i-1;  //yaha hamne j ki value intialize kerdi
            while(j>=0&&a[j]>temp){  //agar dono conditions satisfy karengi toh it will enter loop
                a[j+1]=a[j];         // ye sorted array mai se value lega aur j+1 mai daldega
                j--;                 //loop ulta chalra hai isliye j--
            }
            a[j+1]=temp;  // yaha bhar aake j ki value blank value hai uske ander temp store hojayega
        }
        System.out.println("This is your array after sorting");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

    }
    
}
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursion a=new Recursion();
        int b= a.fact(5);
        System.out.println(b);
    }
    int fact(int n){
        if(n==0||n==1) return 1;
        else return fact(n-1)*n;
    }
}



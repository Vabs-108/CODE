public class Recursivefibonacci {
    public static void main(String[] args) {
        Recursivefibonacci m=new Recursivefibonacci();
        int c = m.recursion(10);
        System.out.println(c);
    }
    int recursion(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return recursion(n-1)+recursion(n-2);
    }
}

public class Print_N_numbers {
    public static void main(String[] args) {
        
        Print_N_numbers b =new Print_N_numbers();
        b.printnumber(10);
        
    }
    void printnumber(int n){

        if(n==1){System.out.println(1); return;}
        
        
        printnumber(n-1);
        System.out.println(n);
    }
}

public class PalindromeRecursion {
    
    public static void main(String[] args) {
        PalindromeRecursion bc = new PalindromeRecursion();
        String s="Vaibhav";
        bc.ispalindrome(s, 0, 1);
    }
    boolean ispalindrome(String s,int l,int r){
        if( l>=r) return true; 
        if(s.charAt(l)==s.charAt(r)){
            ispalindrome(s, l+1, r-1);
        }
        return false;
    }
}

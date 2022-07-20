public class Arraysmallest{
public static void main(String[] args) {
    int a[]={5,2,43,31,42,45};
    int small=a[0];
    for(int i=1;i<a.length;i++){
    if(a[i]<small)
        small=a[i];
        System.out.println(small);
}

}
}
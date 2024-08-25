public class Pascal{
    public int Factorial(int n){
        if(n==0)
         return 1;
        return n*Factorial(n-1); 
    }
public static void main(String[]args){
    int a,b;
    int k=5;
    Pascal p = new Pascal();
    for(a=0; a<=k; a++){
        for(b=1; b<=k-a; b++){
            System.out.print(" ");
        }
        for(b=1; b<=a; b++){
            System.out.print(" "+p.Factorial(a)/(p.Factorial(a-b)*p.Factorial(b)));
        }
        System.out.println();
    }
}
}
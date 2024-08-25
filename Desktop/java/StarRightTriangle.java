public class StarRightTriangle{
    public static void Right(int n){
        int a,b;
        for(a=0; a<n; a++){
            for (b=1*(n-a); b>=0; b--){
                System.out.print(" ");
            }
            for(b=0; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
     int k = 5;
     Right(k);   
    }
}
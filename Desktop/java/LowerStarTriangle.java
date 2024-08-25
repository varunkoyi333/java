public class LowerStarTriangle {
    public static void First_P(int n){
        int a,b;
       for(a=1; a<=n; a++){
        for(b=1; b<a; b++){
            System.out.print(" ");
        }
        for(b=a; b<=n; b++){
            System.out.print("*"+" ");
        }
        System.out.println();
       }
    }
    public static void Second_P(int n){
        int a,b;
        for(a=n-1; a>=0; a--){
            for(b=1; b<=a; b++){
                System.out.print(" ");
            }
            for(b=a; b<=n-1; b++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
    int num = 10;
    First_P(num);
    Second_P(num);
    }
}

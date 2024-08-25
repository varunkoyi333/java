public class Downward {
   public static void main(String[]args){
    int number = 5;
    for(int a= number-1; a>=0; a--){
        for(int b=0; b<=a; b++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
   } 
}

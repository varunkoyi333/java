public class Reverse{
    public static void main(String[]args){
        int number = 7;
        int i,j;
        for(i=number; i>=1; i--){
            for(j = i; j<number; j++){
                System.out.print(" ");
            }
            for(j=1; j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class UpperStarTriangle{
    public static void main(String[]args){
        int number =9;
        for(int a=1; a<=number; a++){
            for(int b=1; b<=number-a; b++){
                System.out.print(" ");
            }
            for(int l=1; l<=a; l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
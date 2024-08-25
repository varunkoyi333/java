public class Square{
 public static void Print_Square(int r){
    for(int a=1; a<=r; a++){
        for(int b=1; b<=r; b++){
            if(a==1||a==r||b==1||b==r||a==b|| b==(r-a+1))
                System.out.print("*");
            
            else
                System.out.print(" ");
            
           
        }
        System.out.println();
    }
 } 
 public static void main(String[]args){
    int rows=20;
    //int Colomn=22;
    Print_Square(rows);
 }  
}
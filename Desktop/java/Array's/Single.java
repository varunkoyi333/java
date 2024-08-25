public class Single{
    public static void main(String[]args){
        int marks[] ={10,20,30,40,50};
        System.out.println(marks[4]);
    for(int i=0; i<marks.length; i++){
        System.out.print(marks[i]+" ");
    }

    for(int mark:marks){
        System.out.print(mark+" ");
    }
    System.out.println(marks.length);
    }
}
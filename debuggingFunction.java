import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter aman marks: ");
        int aman = input.nextInt();
        System.out.println("enter anup marks: ");
        int anup = input.nextInt();
        int pointMargin = aman-anup;
        System.out.println("Point Margin:  " +pointMargin);
        int ranking = ranking(pointMargin);
        System.out.println("ranking is: "+ranking);
    }
    public static int ranking( int pointMargin){
        if(pointMargin > 300){
            return 1;
        }
        else if(pointMargin > 0){
            return 2;
        }
        else if(pointMargin > -100){
            return 3;
        }
        else{
            return 4;
        }
    }
}
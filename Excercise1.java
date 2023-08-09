import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int num;

        for( int i = 1; i<=6; i++ ){
        System.out.println("write 6 numbers");
        num = entry.nextInt();

        if(num <0){
            System.out.println("a negative number was entered :( )");
           
        }
        }

    }
}
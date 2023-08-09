import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner( System.in);
        int num;

        for(int i =1; i<=10; i++){

            System.out.println("write 10 ratings: ");
            num = entry.nextInt();

            if(num>=6){
                System.out.println("It is approved!!!");
            }else{
                System.out.println("reprobate :( ");
            }
        }
    }
}

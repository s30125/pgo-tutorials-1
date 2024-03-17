import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        if(x<0) {
            System.out.println("The number is negative.");

        }else if(x>0) {
            System.out.println("The number is positive.");
        }else if(x==0){
            System.out.println("The value equals 0");
        }
    }
}
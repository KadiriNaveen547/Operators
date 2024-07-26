import java.util.Scanner;
public class Rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");

        System.out.println("Enter Second number");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1 >> 2);
        System.out.println(number2 >> 2);


    }
}

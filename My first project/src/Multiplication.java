import java.util.Scanner;
class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
    }
}

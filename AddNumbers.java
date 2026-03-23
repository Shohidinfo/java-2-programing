import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first nambar: ");
        int a = input.nextInt();

        System.out.print("Enter you second nambar: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("Totall Namber = " + sum);
    }
}
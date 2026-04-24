import java.util.Scanner;

public class swapxjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter the A: ");
        a = input.nextInt();
        System.out.println("Enter the B: ");
        b = input.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("A= " + a);
        System.out.println("B= " + b);
    }
}

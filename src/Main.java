import java.util.Scanner;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int input = scanner.nextInt();

        if (input % 2 == 1) {
            System.out.println("Your Number is Odd");
        }
        else {
            System.out.println("Your Number is Even");
        }
        }

    }

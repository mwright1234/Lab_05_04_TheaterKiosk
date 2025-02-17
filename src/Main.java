import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.print("Please enter your age: ");
        age = in.nextInt();

        if (age >= 21) {
            System.out.print("You get a wrist band!");
        }

    }
}








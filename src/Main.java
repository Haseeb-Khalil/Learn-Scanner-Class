import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("What would you like to say?");
        String message = scanner.next();
        message += scanner.nextLine(); // Read the rest of the line
        System.out.println(name + " says: " + message);
    }
}
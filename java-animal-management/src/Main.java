import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Animal;
import models.Dog;
import models.Monkey;

public class Main {
    private static final List<Animal> animals = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Animal Management Console App ===");
        boolean running = true;
        while (running) {
            System.out.println("\n1) Add Dog\n2) Add Monkey\n3) List Animals\n4) Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    addDog();
                    break;
                case "2":
                    addMonkey();
                    break;
                case "3":
                    listAnimals();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    private static void addDog() {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Breed: ");
        String breed = scanner.nextLine().trim();
        System.out.print("Age (years): ");
        int age = readInt();
        animals.add(new Dog(name, age, breed));
        System.out.println("Dog added!");
    }

    private static void addMonkey() {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Species: ");
        String species = scanner.nextLine().trim();
        System.out.print("Age (years): ");
        int age = readInt();
        animals.add(new Monkey(name, age, species));
        System.out.println("Monkey added!");
    }

    private static void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals yet.");
            return;
        }
        System.out.println("\n-- Animals --");
        for (Animal a : animals) {
            System.out.println(a.describe());
        }
    }

    private static int readInt() {
        while (true) {
            try {
                String s = scanner.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }
}
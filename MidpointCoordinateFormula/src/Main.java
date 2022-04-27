import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double coordinateX = (x1 + x2) / 2;
        double coordinateY = (y1 + y2) / 2;

        System.out.println("The midpoint is: (" + coordinateX + ", " + coordinateY + ")");

        scanner.close();
    }
}
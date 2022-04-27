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

        String k = "";
        String b;

        double k1 = (y1 - y2);
        double k2 = (x1 - x2);
        double b1 = -1 * x2 * y1 + x1 * y2;
        if (k1 / k2 < 0)
            k = "-";
        if (b1 / k2 < 0)
            b = "-";
        else if (b1 / k2 == 0)
            b = "";
        else
            b = "+";

        k1 = Math.abs(k1);
        k2 = Math.abs(k2);
        b1 = Math.abs(b1);

        if (k2 == 1)
            k += (int)k1;
        else
        {
            if(k1 % k2 == 0)
                k += (int)(k1 / k2);
            else
                k += (int)k1 + "/" + (int)k2;
        }

        if(k2 == 1 && b1 != 0)
            b += (int)b1;
        if(k2 != 1 && b1 != 0)
        {
            if(b1 % k2 == 0)
                b += (int)(b1 / k2);
            else
                b += (int)b1 + "/" + (int)k2;
        }

        System.out.println("The Linear Function is: y = " + k + "x" + b);

        scanner.close();
    }
}
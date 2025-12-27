import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String AREA = "AREA";
    private static final String PERIMETER = "PERIMETER";

    private static void finalOutPut(double length, double width, double area, double perimeter) {
        System.out.println("\nRectangle Calculation Result");
        System.out.println("-------------------------------");
        System.out.printf("Length     : %.2f%n", length);
        System.out.printf("Width      : %.2f%n", width);
        System.out.printf("Area       : %.2f%n", area);
        System.out.printf("Perimeter  : %.2f%n", perimeter);
    }

    private static double getInputPositiveValue(Scanner sc, String message) {
        double inputValue;
        while (true) {
            System.out.println(message);
            inputValue = sc.nextDouble();
            if (inputValue >= 0) {
                break;
            } else {
                System.out.println("Negative value not allowed here.Please Input Positive value!!");
            }
        }
        return inputValue;
    }

    private static double calculation(double length, double width, String type) {
        double result = 0;
        if (Objects.equals(type, "AREA")) {
            result = length * width;

        } else if (Objects.equals(type, "PERIMETER")) {
            result = 2 * (length + width);
        }
        return result;
    }

    public static void main(String[] args) {
        double length, width, area, perimeter;
        Scanner sc = new Scanner(System.in);
        length = getInputPositiveValue(sc, "Enter the length: ");
        width = getInputPositiveValue(sc, "Enter the width: ");
        area = calculation(length, width, AREA);
        perimeter = calculation(length, width, PERIMETER);
        finalOutPut(length, width, area, perimeter);
    }
}
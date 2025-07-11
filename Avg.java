
public class Avg {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        scanner.close();
    }
}

